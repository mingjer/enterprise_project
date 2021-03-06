package com.bt.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import com.bt.base.redis.RedisUtils;
import com.bt.lmis.dao.EmployeeMapper;
import com.bt.lmis.model.Employee;

/** 
* @ClassName: SessionFilter 
* @Description: TODO(过滤器) 
* @author Yuriy.Jiang
* @date 2016年5月29日 下午4:18:33 
*  
*/
public class SessionFilter extends OncePerRequestFilter {

	@Autowired
    private EmployeeMapper<T> mapper;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// 不过滤的uri
		String[] notFilter = new String[] { "lmis_login.jsp" };
		// 请求的uri
		String uri = request.getRequestURI();
		if (uri.indexOf("control") != -1) {
			boolean doFilter = true;
			for (String s : notFilter) {
				if (uri.indexOf(s) != -1) {
					// 如果uri中包含不过滤的uri，则不进行过滤
					doFilter = false;
					break;
					
				}
				
			}
			if (doFilter) {
				// 从session中读取当前登录的用户
				Object obj = request.getSession().getAttribute(BaseConst.login_session);
				String token_mark=(String)request.getSession().getAttribute("token_mark");
				String task_mark=(String)request.getSession().getAttribute("task_mark");
				// 如果session中不存在登录者实体，则弹出框提示重新登录
				// 设置request和response的字符集，防止乱码
				request.setCharacterEncoding("UTF-8");
				response.setCharacterEncoding("UTF-8");
				if (null == obj) {
					
					PrintWriter out = response.getWriter();
					StringBuilder builder = new StringBuilder();
					builder.append("<script type=\"text/javascript\">");
//					builder.append("alert('网页过期，请重新登录！');");
					builder.append("window.top.location.href='");
					builder.append(request.getScheme());
					builder.append("://");
					builder.append(request.getServerName());
					builder.append(":");
					builder.append(request.getServerPort());
					builder.append(request.getContextPath());
					builder.append("';");
					builder.append("</script>");
					out.print(builder.toString());
				} else {
					Employee session_employee = SessionUtils.getEMP(request);
					if(session_employee!=null){
						
					String token_result=RedisUtils.get(String.valueOf(session_employee.getId()).concat("_toke_mark"));
					if(null!=token_result && token_mark!=null &&!token_result.equals(token_mark) && "1".equals(task_mark)){
						PrintWriter out = response.getWriter();
						StringBuilder builder = new StringBuilder();
						builder.append("<script type=\"text/javascript\">");
						builder.append("alert('账号异地登陆，您已下线！');");
						builder.append("window.top.location.href='");
						builder.append(request.getScheme());
						builder.append("://");
						builder.append(request.getServerName());
						builder.append(":");
						builder.append(request.getServerPort());
						builder.append(request.getContextPath());
						builder.append("';");
						builder.append("</script>");
						out.print(builder.toString());	
					 }else{
							filterChain.doFilter(request, response);
					 }
						
					}
		
				}
				
			} else {
				filterChain.doFilter(request, response);
			}
			
		} else {
			filterChain.doFilter(request, response);
			
		}
		
	}

}

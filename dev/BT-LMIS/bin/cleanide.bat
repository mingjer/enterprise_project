@echo off
rem /**
rem  * Author: jindong.lin@baozun.com
rem  */
echo.
echo [��Ϣ] ����Eclipse�����ļ���
echo.
pause
echo.

cd %~dp0

cd..
call mvn -Declipse.workspace=%cd% eclipse:clean eclipse:eclipse

del .classpath
del .project

pause
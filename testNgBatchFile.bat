set projectLocation=C:\Users\Jit\Desktop\Selenium\TestNgProject
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\sanity.xml
pause
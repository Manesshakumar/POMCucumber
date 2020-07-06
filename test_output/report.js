$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/user/Desktop/Training/POMCucumber/src/main/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Validation",
  "description": "",
  "id": "free-crm-login-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid Login Validation",
  "description": "",
  "id": "free-crm-login-validation;valid-login-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user enter the Valid URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Check the no of links available on webpage",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Check the no of text available on webpage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter valid username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_stepDef.user_enter_the_Valid_URL()"
});
formatter.result({
  "duration": 21237050986,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepDef.check_the_no_of_links_available_on_webpage()"
});
formatter.result({
  "duration": 87463616,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepDef.check_the_no_of_text_available_on_webpage()"
});
formatter.result({
  "duration": 81068728,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepDef.enter_valid_username_and_password()"
});
formatter.result({
  "duration": 3809040,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat com.crm.qa.pages.LoginPage.loginValidation(LoginPage.java:42)\r\n\tat stepDefinition.Login_stepDef.enter_valid_username_and_password(Login_stepDef.java:40)\r\n\tat ✽.Then enter valid username and password(C:/Users/user/Desktop/Training/POMCucumber/src/main/java/features/login.feature:8)\r\n",
  "status": "failed"
});
});
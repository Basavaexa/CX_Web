$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/LoginCx.feature");
formatter.feature({
  "name": "Login to CX",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens the URL \"https://cx-uat.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the email as \"fzaouai@aldar.com\" and password as \"owner123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_the_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_the_login()"
});
formatter.result({
  "status": "passed"
});
});
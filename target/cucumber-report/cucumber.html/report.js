$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TombolaPage.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8627384600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User logs in successfully",
  "description": "",
  "id": "login-feature;user-logs-in-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on accept cookies button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Verify the text on the Login Page \u0027Login to\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters valid User Name",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters valid Password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be redirected to the home page and verify the text britain\u0027s biggest bingo site",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.userIsOnTheLoginPage()"
});
formatter.result({
  "duration": 227220901,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.userClicksOnAcceptCookiesButton()"
});
formatter.result({
  "duration": 227708300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.verifyTheTextOnTheLoginPageLoginTo()"
});
formatter.result({
  "duration": 1198856500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.userEntersValidUserName()"
});
formatter.result({
  "duration": 136256399,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.userEntersValidPassword()"
});
formatter.result({
  "duration": 161996500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.userClicksTheLoginButton()"
});
formatter.result({
  "duration": 3399908900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userShouldBeRedirectedToTheHomePageAndVerifyTheTextBritainSBiggestBingoSite()"
});
formatter.result({
  "duration": 163573200,
  "status": "passed"
});
formatter.after({
  "duration": 842815000,
  "status": "passed"
});
});
package net.diaowen.common.base.controller;

import net.diaowen.common.plugs.httpclient.HttpResult;
import net.sf.json.JSON;

public class LoginRegisterResult {

    private String status;
    private String type;
    private String[] currentAuthority;
    private String token;
    private HttpResult httpResult;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getCurrentAuthority() {
        return currentAuthority;
    }

    public void setCurrentAuthority(String[] currentAuthority) {
        this.currentAuthority = currentAuthority;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public HttpResult getHttpResult() {
        return httpResult;
    }

    public void setHttpResult(HttpResult httpResult) {
        this.httpResult = httpResult;
    }

    public static LoginRegisterResult RESULT(String status,String type){
        LoginRegisterResult loginResult = new LoginRegisterResult();
        loginResult.setStatus(status);
        loginResult.setType(type);
        loginResult.setCurrentAuthority(new String[]{});
        return loginResult;
    }

    public static LoginRegisterResult SUCCESS(String currentAuthority){
        LoginRegisterResult loginResult = new LoginRegisterResult();
        loginResult.setStatus("ok");
        loginResult.setType("account");
//        loginResult.setCurrentAuthority("admin");
        loginResult.setCurrentAuthority(new String[]{currentAuthority});
        return loginResult;
    }

    public static LoginRegisterResult SUCCESS(String[] currentAuthority){
        LoginRegisterResult loginResult = new LoginRegisterResult();
        loginResult.setStatus("ok");
        loginResult.setType("account");
//        loginResult.setCurrentAuthority("admin");
        loginResult.setCurrentAuthority(currentAuthority);
        return loginResult;
    }

    public static LoginRegisterResult FAILURE(){
        LoginRegisterResult loginResult = new LoginRegisterResult();
        loginResult.setStatus("error");
        loginResult.setType("account");
        loginResult.setCurrentAuthority(new String[]{"guest"});
        return loginResult;
    }

    public static LoginRegisterResult FAILURE(HttpResult httpResult){
        LoginRegisterResult loginResult = new LoginRegisterResult();
        loginResult.setStatus("error");
        loginResult.setType("account");
        loginResult.setCurrentAuthority(new String[]{"guest"});
        loginResult.setHttpResult(httpResult);
        return loginResult;
    }

    public static LoginRegisterResult SUCCESS(String[] currentAuthority, HttpResult httpResult){
        LoginRegisterResult loginRegisterResult = SUCCESS(currentAuthority);
        loginRegisterResult.setHttpResult(httpResult);
        return loginRegisterResult;
    }

    public static LoginRegisterResult SUCCESS(String token, String[] currentAuthority, HttpResult httpResult){
        LoginRegisterResult loginRegisterResult = SUCCESS(currentAuthority,httpResult);
        loginRegisterResult.setToken(token);
        return loginRegisterResult;
    }
}

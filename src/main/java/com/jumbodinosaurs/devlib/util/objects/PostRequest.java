package com.jumbodinosaurs.devlib.util.objects;

public class PostRequest
{
    private String username;
    private String password;
    private String email;
    private String token;
    private String path;
    private String command;
    private String content;
    private String captchaCode;
    private String emailCode;
    private String listName;
    private String connectionName;
    private String queryRequest;
    
    public PostRequest()
    {
    
    }
    
    
    public PostRequest getCensored()
    {
        PostRequest censored = this;
        censored.setPassword("");
        censored.setToken("");
        return censored;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getToken()
    {
        return token;
    }
    
    public void setToken(String token)
    {
        this.token = token;
    }
    
    public String getPath()
    {
        return path;
    }
    
    public void setPath(String path)
    {
        this.path = path;
    }
    
    public String getCommand()
    {
        return command;
    }
    
    public void setCommand(String command)
    {
        this.command = command;
    }
    
    public String getContent()
    {
        return content;
    }
    
    public void setContent(String content)
    {
        this.content = content;
    }
    
    public String getCaptchaCode()
    {
        return captchaCode;
    }
    
    public void setCaptchaCode(String captchaCode)
    {
        this.captchaCode = captchaCode;
    }
    
    public String getEmailCode()
    {
        return emailCode;
    }
    
    public void setEmailCode(String emailCode)
    {
        this.emailCode = emailCode;
    }
    
    public String getListName()
    {
        return listName;
    }
    
    public void setListName(String listName)
    {
        this.listName = listName;
    }
    
    public String getConnectionName()
    {
        return connectionName;
    }
    
    public void setConnectionName(String connectionName)
    {
        this.connectionName = connectionName;
    }
    
    
    public String getQueryRequest()
    {
        return queryRequest;
    }
    
    public void setQueryRequest(String queryRequest)
    {
        this.queryRequest = queryRequest;
    }
    
    @Override
    public String toString()
    {
        return "PostRequest{" + "username='" + username + '\'' + ", password='" + password + '\'' + ", email='" + email + '\'' + ", token='" + token + '\'' + ", path='" + path + '\'' + ", command='" + command + '\'' + ", content='" + content + '\'' + ", captchaCode='" + captchaCode + '\'' + ", emailCode='" + emailCode + '\'' + ", listName='" + listName + '\'' + ", connectionName='" + connectionName + '\'' + ", queryRequest=" + queryRequest + '}';
    }
}

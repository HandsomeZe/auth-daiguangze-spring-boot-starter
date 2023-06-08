package cn.ze.tool.middleware.whitelist.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("cn.ze.tool.whitelist")
public class WhiteListProperties {
    private String users;

    public String getUsers(){return users;}

    public void setUsers(String users){
        this.users = users;
    }
}

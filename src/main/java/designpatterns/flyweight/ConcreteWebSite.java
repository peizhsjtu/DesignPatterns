package designpatterns.flyweight;

public class ConcreteWebSite extends Website{
    private String type = "";//网站发布的类型

    public ConcreteWebSite(String type){
        this.type = type;
    }

    public void use(User user){
        System.out.println("网站的发布形式为: " +type+",使用者为: " + user.getName());
    }
}

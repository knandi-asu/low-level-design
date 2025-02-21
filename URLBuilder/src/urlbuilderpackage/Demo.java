package urlbuilderpackage;

public class Demo{
    public static void main(String[] args){
        URLBuilder.Builder builder=new URLBuilder.Builder();
        builder.protocol("http://").hostname("newswebsite:").port("443");
        URLBuilder urlbuilder= builder.build();

        System.out.print(urlbuilder.protocol);
        System.out.print(urlbuilder.hostname);
        System.out.print(urlbuilder.port);
    }
}
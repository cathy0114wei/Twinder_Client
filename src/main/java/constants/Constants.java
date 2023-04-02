package constants;

public class Constants {
    public static int NUM_POST_THREAD = 50;
    public static int TOTAL_POST_REQUEST = 1000;
    public static int TOTAL_GET_REQUEST = -1;

    public static int REQUESTS_PER_SECOND = 5;

    public static int CHANNEL_POOL_CAPACITY = 50;
//    public static String QUEUE_NAME = "MESSAGE_QUEUE";
    public static String QUEUE_NAME = "TempStore";

    public static String EXCHANGE_NAME = "my_exchange";
    public static int QUEUE_NUM = 2;
    public static int USERINFOSIZE = 100;
    //RMQ IP, for the servlet
    public static String HOSTNAME = "54.85.213.222";
    public static String USERNAME = "test";
    public static String PASSWORD = "test";
    //load balancer dns
//    public static String basePath = "http://balancer-616361848.us-east-1.elb.amazonaws.com:8080/Twinder_war";
    //server path, for the client
    public static String basePath ="http://localhost:8084/Twinder_war_exploded";
    public static String filePath = "/Users/cathywei/IdeaProjects/Twinder/out/hw1file/output.csv";
    public static String processFilePath = "/Users/cathywei/IdeaProjects/Twinder/out/hw1file/process";
    public static String processGetFilePath = "/Users/cathywei/IdeaProjects/Twinder/out/hw1file/process_get.csv";
    public static String processPostFilePath = "/Users/cathywei/IdeaProjects/Twinder/out/hw1file/process_post.csv";

    //DB access

    public static String DB_ER2EE = "SwipeF";
    public static String DB_ERDIS = "SwipeF_Dislike";

    public static String DB_EE2ER = "SwipeR";
    public static String accessKeyId = "ASIA3MRIZ5REJO6JCOO7";
    public static String secretAccessKey = "IDZHva9G5GFVKG5AhaM13x7sACKlcDr1Rv9h/LZw";
    public static String sessionToken = "FwoGZXIvYXdzEOb//////////wEaDGV2VkPcyq/mHA1/jCLIAYd/rr4HmUT4aiNzbPrN3wQXbLATjJFJR4jQkXiInHwC/t4jmAb61gExH41M0pV9kgVfcJsfO55OZalMbh90Hfrs8c9yiMV8qPAxJ8mhroMzp15TQ13kRwKia3xCbrE+s1k+eTB+Uo+TlP3RvtIVXTvaxgknfx2UDNiXpAPiwlN7e8RXsCCVWb/XHNl4LdV6sgPAjI9EWkC+OjS4YpgwBFOitDZfPEgx88T64qVYAGfxB7TaqSBur5siatwVladxiRsPj2Msjyi7KJGzoqEGMi01EiClNQazLhS6xDgUSczAzCxxKSyDd1WJWy9LFSVvYWfsV9eM3u15wSNkp/c=";
}
    //    public static String throuput = "/Users/cathywei/IdeaProjects/Twinder/out/graph/throuput.csv";
//    public static String time = "/Users/cathywei/IdeaProjects/Twinder/out/graph/time.csv";


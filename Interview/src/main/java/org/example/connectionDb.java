package org.example;

public class connectionDb {

    private static connectionDb singletoneInstance;

    private connectionDb() {
        System.out.println("Database Connection Done");
    }

    public static connectionDb getInstance()
    {
        if (singletoneInstance == null)
        {
            synchronized (connectionDb.class)
            {
                if (singletoneInstance == null)
                {
                    singletoneInstance = new connectionDb();
                }
            }
        }
        return singletoneInstance;
    }

    public void exicuteQuey(String query)
    {
        System.out.println("Exicuting : " + query);
    }
}

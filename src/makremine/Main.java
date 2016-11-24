package makremine;

public class Main
{

    public static void main(String[] args)
    {
        Robot Amis[] = new Robot [5];

        Amis[0] = new Robot("Mohamed");
        Amis[1] = new Robot("Zinou",5,6,"Nord");
        Amis[2] = new Robot("Yacine");
        Amis[3] = new RobotNG("yasmine",6,9,"Ouest");
        Amis[4] = new RobotNG("Ilyes");

        for (int i=0;i<5;i++)
        {
            Amis[i].Afficher();
        }
    }
}

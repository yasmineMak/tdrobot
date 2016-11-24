package makremine;

public class RobotNG extends Robot
{
    private boolean turbo;

    public RobotNG()
    {
        super();
        this.turbo=false;
    }

    public RobotNG(String Nom)
    {
        super(Nom);
        this.turbo=false;
    }

    public RobotNG (String Nom,int x,int y,String Direction)
    {
        super(Nom,x,y,Direction);
        this.turbo=false;
    }
    //B

    public void Avance(int NbrPas)
    {
        if (this.turbo==false)
        {
            switch (getDirection())
            {
                case "East": {
                    setX(getX() + NbrPas);
                }
                break;
                case "Ouest": {
                    setX(getX() - NbrPas);
                }
                break;
                case "Nord": {
                    setX(getY() + NbrPas);
                }
                break;
                case "sud": {
                    setX(getY() - NbrPas);
                }
                break;
            }
        }
        else
        {
            int NbrPas2;
            NbrPas2=NbrPas*3;

            switch (getDirection())
            {
                case "East": {
                    setX(getX() + NbrPas2);
                }
                break;
                case "Ouest": {
                    setX(getX() - NbrPas2);
                }
                break;
                case "Nord": {
                    setX(getY() + NbrPas2);
                }
                break;
                case "sud": {
                    setX(getY() - NbrPas2);
                }
                break;
            }
        }
    }

    public void Gauche()
    {
        switch (getDirection())
        {
            case "East": {
                setDirection("Nord");
            }
            break;
            case "Ouest": {
                setDirection("Sud");
            }
            break;
            case "Nord": {
                setDirection("Ouest");
            }
            break;
            case "sud": {
                setDirection("East");
            }
            break;
        }
    }

    public void DemiTour()
    {
        switch (getDirection())
        {
            case "East": {
                setDirection("Ouest");
            }
            break;
            case "Ouest": {
                setDirection("East");
            }
            break;
            case "Nord": {
                setDirection("Sud");
            }
            break;
            case "sud": {
                setDirection("Nord");
            }
            break;
        }
    }

    public void Avance2(int NbrPas)
    {
        for (int i = 0; i < NbrPas; i++)
        {
            super.Avance();
        }
    }

    public void Gauche2()
    {
        for (int i=0;i<3;i++)
        {
            super.Droit();
        }
    }

    public void DemiTour2()
    {
        for (int i=0;i<2;i++)
        {
            super.Droit();
        }
    }

    public void setTurbo(boolean turbo)
    {
        this.turbo = turbo;
    }

    public boolean getTurbo()
    {
        return this.turbo;
    }

    public void activerTurbo()
    {
        setTurbo(true);
    }

    public void désactiverTurbo()
    {
        setTurbo(false);
    }

    public void Afficher()
    {
        if (this.turbo == false)
        {
            System.out.println("le Robot " + getNom() + " il est a la position (" + getX() + "," + getY() + ") ca direction est vers " + getDirection()+" Turbo Désactiver");
        }
        else
        {
            System.out.println("le Robot " + getNom() + " il est a la position (" + getX() + "," + getY() + ") ca direction est vers " + getDirection()+" Turbo Activer");


        }
    }
}

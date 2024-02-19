<h1>Projet d'Inversion de contrôle et Injection des dépendances</h1>

<h2>Introduction :</h2>

<p>
    L'inversion de contrôle, souvent abrégée en IoC, est un principe de conception qui renverse le contrôle de l'exécution d'une application. Au lieu que les composants de l'application appellent directement les dépendances dont ils ont besoin, ces dépendances sont fournies par un conteneur IoC.
</p>
<p>
    L'injection de dépendances (DI) est une technique permettant de fournir les dépendances requises par un composant sans que celui-ci les construise explicitement. 
</p>

<h2>Enoncé :</h2>

<p>

1. Créer l'interface IDao avec une méthode getDate

2. Créer une implémentation de cette interface 

3. Créer l'interface IMetier avec une méthode calcul

4. Créer une implémentation de cette interface en utilisant le couplage faible

5. Faire l'injection des dépendances :

   a. Par instanciation statique

    b. Par instanciation dynamique 
    
    c. En utilisant le Framework Spring
     - Version XML
     - Version annotations
</p>

<h2>Conception :</h2>
<img align="center" src="images/img.png">

<h2>Partie 1 :</h2>
<h3>1/- L’interface IDao : </h3>
<p>
    package dao;

    public interface IDao {
        double getData();
    }
</p>

<h3>2/- Implémentation : </h3>
<p>
    package dao;

    public class IDaoImpl implements IDao {
        @Override
        public double getData() {
            return Math.random()*40;
        }
    }
</p>

<h3>3/- L’interface IMetier :</h3>
<p>
    package metier;

    public interface IMetier {
        double calcul();
    }
</p>

<h3>4/-  L’implémentation de cette interface en utilisant le couplage faible :</h3>
<p>
    package metier;
    
    import dao.IDao;
    
    public class IMetierImpl implements IMetier {
        private IDao dao;
        @Override
        public double calcul() {
            double tmp = dao.getData();
            double res = tmp*540/Math.cos(tmp*Math.PI);
            return res;
        }
    
        public void setDao(IDao dao) {
            this.dao = dao;
        }
    } 
</p>

<h3>5/- l'injection des dépendances :</h3>
<h4>a.	Par instanciation statique :</h4>
<p>
    package presentation;
    
    import dao.IDaoImpl;
    import ext.IDaoImpl2;
    import metier.IMetierImpl;
    
    public class Main {
        public static void main(String[] args) {
            IDaoImpl dao = new IDaoImpl();
            IDaoImpl2 dao2 = new IDaoImpl2();
            IMetierImpl metier = new IMetierImpl();
    
            metier.setDao(dao);
            System.out.println("Résultat : "+metier.calcul());
    
        }
    }
</p>
<img src="images/img_1.png"></img>

<p>
    
    package presentation;
    
    import dao.IDaoImpl;
    import ext.IDaoImpl2;
    import metier.IMetierImpl;
    
    public class Main {
        public static void main(String[] args) {
            IDaoImpl dao = new IDaoImpl();
            IDaoImpl2 dao2 = new IDaoImpl2();
            IMetierImpl metier = new IMetierImpl();
    
            metier.setDao(dao2);
            System.out.println("Résultat : "+metier.calcul());
        }
    }
</p>





 

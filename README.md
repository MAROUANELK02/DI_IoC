﻿<h1>Projet d'Inversion de contrôle et Injection des dépendances</h1>

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



 

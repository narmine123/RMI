# Exercice2
Objectif de l’exercice : L'exercice consiste à réaliser un serveur RMI (qui fait un simple traitement : conversion de chaine, echo, ou tout autre traitement....) et un Client RMI.
Pour une organisation des fichiers, chaque classe est définie dans son propre fichier avec un nom correspondant à celui de la classe.Pour résoudre ces erreurs, On déplace les déclarations de classe StringProcessorImpl et StringProcessor dans leurs propres fichiers respectifs.

## Côté serveur RMI:
1.	Création d'une instance de StringProcessorImpl .
2. Création et démarrage du registre RMI sur le port 1099.
3.	Enregistrement de l'objet distant avec l'annuaire RMI sous le nom "StringProcessor" sur le registre localhost

4. Affichage d'un message pour indiquer que le serveur RMI est prêt

5. Gestion des exceptions : Capture de toute exception survenue lors du démarrage du serveur et affichage de celle-ci



## Côté client :
1.	Recherche de l'objet distant dans le registre RMI.
2.	Appel de la méthode à distance et récupération du résultat.
3.	Affichage du résultat.
4.	Gestion des exceptions :  Capture et affichage des exceptions.

## Vérifier s'il y a une génération de souches (stubs) ou non :
Pour vérifier si votre programme RMI génère les souches ou non, il faut  examiner le processus de compilation. Si on ne voit pas d'appel explicite à l'outil rmic dans le processus de compilation, il est probable que les souches soient générées automatiquement par le runtime Java lors de l'exécution.
## Localiser le serveurs de noms utilisé avec RMI et sur quel port il tourne par défaut:
Par défaut, le serveur de noms utilisé avec RMI est le registre RMI. Le registre RMI est une implémentation de l'interface java.rmi.registry.Registry qui permet aux clients de rechercher des objets distants enregistrés et de récupérer des références vers ces objets.

Le registre RMI tourne par défaut sur le port 1099. Cela signifie que si on démarre un registre RMI sans spécifier de port, il écoutera sur le port 1099. Si on utilise un port différent, on doit  spécifier explicitement ce port lors du démarrage du registre RMI.


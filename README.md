# Correction du tp livre api avec Java et le framework Spring Boot
# Enoncé de l'exercice

**Exercice 1** : 
1 Créer une nouvelle **base de données** avec une **table Livre** qui va contenir les **attributs suivants** :

- id **clé primaire** de type int et auto_increment not null,
- titre de type varchar(50) unique not null,
- description de type varchar(255) not null,
- date_publication de type date not null.
- 
2 Créer un nouveau projet **Spring Boot** avec les dépendances suivantes :
*Spring Web, Spring Data JPA, Driver Mysql et Lombok*.

3 Créer un **model Livre** qui va représenter la **table Livre** de la BDD avec :
- les **Attributs**,
- **Getters et setters**,
- **Constructeurs** vide et avec les 4 paramètres (*sauf id*),
- Méthode **toString** pour afficher un Livre.

4 Créer une **interface LivreRepository** qui va hériter de **CrudRepository**,

5 Créer un **service LivreService** qui va implémenter toutes les méthodes CRUD,

6 Créer un **controller LivreController** qui va exposer les **méthodes CRUD de l’API** :

- afficher la liste,
- afficher un livre par son ID,
- ajouter un livre,
- modifier un livre par son ID,
- supprimer un livre par son ID,

7 Tester vos **End Points** pour vérifier que tout fonctionne correctement. 

**Bonus** : Mettez en place les **exceptions** suivantes :
- Le livre n’existe pas,
- Le livre existe déjà (gérer les doublons).

# Signin

## Etape 1: Formulaire
Créer un formulaire permettant de créer (dans une liste), un utilisateur. Pour l'instant, sans aucune règles de gestions.
Les informations minimales sont: login, nom, prénom, adresse mail, date de naissance, mot de passe, confirmation du mot de passe.

## Etape 2: Validation

- Il n'est pas autorisé d'avoir plusieurs comptes avec le même login.
- Les mots de passes saisis doivent contenir au moins une majuscule, une minuscule, un chiffre et un caractère spécial (,!*.).
- Les 2 mots de passes doivent identiques.
- L'adresse mail et la date de naissance sont obligatoires.
- L'adresse mail doit être unique.

## Etape 3: Validation au fil de l'eau
On ne doit plus pouvoir soumettre le formulaire si celui-ci contient une erreur.

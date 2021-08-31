# Liste d'informations dans un tableau
## Objet à définir
| Beer |
|--|
| id: long |
| name: string(64) |
| brewer: string(64) |
| colour: string(12) |
| abv: string(7) _alcohol by volume_ |
| bottle_size (L): string(7) |
| produced_since: string(10) |

## Sources
Dans ce projet, dans le package fr.kikori.ws.tableaux.basique se trouve la classe Beer ainsi qu'un provider fournissant des données.

## Etape 1: Texte
Produire une application où toutes les bières sont listées dans un tableau.

## Etape 2: Types de données
Changer le type des colonnes _abv, bottle_size, produced_since_ pour qu'elles soient des nombres et/ou date selon la colonne.
Transformer le tableau pour que les colonnes fonctionnent avec ces types de données

## Etape 3: Formatage spécial
Faire en sorte que les valeur nulles apparaissent avec un tiret à la place d'être vide.
Les valeurs de la colonne _abv_ doivent être suffixées de "°"
Les valeurs de la colonne bottle_size doivent être en nombre entiers avec leur unité au lieu d'une fraction de litre (ex: _33 cl_ au lieu de _0.33 l_)

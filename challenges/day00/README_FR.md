# Jour 00 – Echauffement

Avant de nous plonger dans le calendrier, nous commençons par une **journée de préparation**.

Nous ne faisons pas l'exercice ici, nous nous **familiarisons avec le cadre**. Nous allons jouer avec nos souvenirs et les examiner sous différents angles au cours du mois.

L'idée ici est de configurer votre **IDE**, votre **assistant IA** et votre **workflow** afin que le reste de l'aventure se déroule sans encombre.

Nous utiliserons un premier souvenir comme terrain de jeu :

> **Fragment de souvenir – 2023 · Jour 1**  
> J'ai vu ce code il y a longtemps...  
> Je l'ai repris une fois et l'ai rendu plus facile à comprendre  
> en découpant cette grande méthode en plusieurs méthodes privées plus petites, chacune racontant une petite  
> partie de l'histoire.  
> Je ne me souviens pas très bien des règles, mais je me souviens de cette sensation :  
> *« Ahhh, c'est donc ça quand le code commence à se lire comme de la prose. »*

---

## Où jouer ?

Choisissez la stack que vous souhaitez utiliser comme **stack principale** cette année et ouvrez le souvenir du jour 1 de 2023, par exemple :

- `memories/2023/exercises/<votre-stack>/day01`

Il s'agit simplement de votre **bac à sable** pour aujourd'hui.

---

## Challenge — Configurez vos outils

Objectif : Assurez-vous que vous pouvez exécuter des tests, que votre IDE est bien configuré et que vous disposez de tous les plugins dont vous avez besoin (SonarLint, un assistant IA, etc.).

---

## Tutoriel

### Exemple de validation du challenge correspondant au souvenir 

ATTENTION La section suivante est là pour vous aider à démarrer.  
Elle ne sera **pas** fournie les jours suivants — tout le reste se passera sur Discord.

#### 1. Exécutez les tests correctement

- Ouvrez le projet dans votre IDE.
- Assurez-vous que vous pouvez exécuter les tests **à l'aide d'une seule commande ou d'un raccourci** :
  - par exemple, une tâche Gradle/Maven, une configuration d'exécution de test, `npm test`, `pytest`, etc.
- Exécutez-les une fois et notez :
  - Ont-ils réussi ?
  - Combien de temps ont-ils pris ?
  - Y a-t-il quelque chose que vous devez corriger ou configurer (SDK, JDK, dépendances) ?

> *Objectif :* à la fin, « exécuter tous les tests » devrait vous sembler trivial.

---

#### 2. Configurez votre IDE

Configurez votre éditeur de manière à pouvoir **voir les tests et l'implémentation ensemble** :

- Divisez votre écran/vos panneaux de manière à ce que (exemple) :
  - à **gauche** : se trouvent le(s) fichier(s) de test pour ce morceau de code,
  - à **droite** : se trouve le code de production (la grande méthode/l'objet que vous allez refactoriser).
- Créez toutes les configurations d'exécution que vous souhaitez réutiliser au cours du mois (exécuteur de tests, débogueur, etc.).

> *Objectif :* entraîner vos yeux à passer sans effort des tests au code.

---

#### 3. Utilisez les outils de refactorisation de manière appropriée

Utilisez maintenant les **outils de refactorisation de l'IDE** (et non le copier-coller manuel) pour simplifier la grande méthode :

- Identifiez la condition complexe / qui manque d'expressivité.
- Utilisez **« Extraire la méthode »** / **« Extraire la fonction »** pour :
  - extraire les petites méthodes privées,
  - leur donner des noms qui décrivent le comportement du domaine (et non les détails techniques), par exemple :
    - `loadConfiguration()`
    - `validateRequest()`
    - `assignGiftsToElves()`
- Exécutez les tests après chaque paire d'extractions (ou au moins régulièrement) pour confirmer que le comportement reste le même.

Vous n'avez pas besoin d'un **design parfait**.  
Vous voulez simplement ressentir à quel point les refactorisations sont rapides et sûres lorsque vos outils sont correctement configurés.

---

#### 4. Réfléchissez avec votre assistant IA

Choisissez l'assistant IA que vous souhaitez utiliser pendant cet Avent.

Utilisez-le **une seule fois** dans cet exercice du jour 0, uniquement à des fins de réflexion :

- Montrez-lui la méthode refactorisée et les méthodes privées extraites.
- Posez-lui des questions telles que :
  - « D'après les noms seuls, que penses-tu que fait cette classe ? »
  - « Suggére moi d'autres noms pour ces méthodes. »

Ensuite, **vous** décidez :

- Quelles suggestions acceptez-vous ?
- Lesquelles rejetez-vous ?
- Qu'est-ce que cela vous apprend sur vos propres goûts et préjugés ?

Pousser votre solution dans le répertoire `community/solutions/day00/` en utilisant et copiant le template ici `community/solutions/TEMPLATE-[replace_with_your_name].md`

Utilisez un fichier `journey/your-name.md`, rédigez une brève entrée pour le jour 0 :

- A-t-il été difficile de faire fonctionner les tests ?
- Quels raccourcis de refactorisation avez-vous découverts ou redécouverts ?
- Une chose que votre assistant IA a dite et avec laquelle vous êtes d'accord/en désaccord.

---

Le challenge correspondant à ce souvenir est validée lorsque :

- vos tests s'exécutent facilement,
- la disposition de votre IDE vous semble utile,
- vous avez lu et compris les suggestions de l'IDE,
- vous avez réussi à extraire quelques méthodes à l'aide des outils de refactorisation,
- et vous avez eu au moins une **petite conversation avec votre IA** au sujet du code.

Demain, nous plongerons dans la véritable boucle temporelle. Aujourd'hui, il s'agit simplement de **vous assurer que vous disposez d'un cockpit confortable pour les tâches à venir**. ✨
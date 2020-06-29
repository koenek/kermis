# kermis

Je gaat een programma maken dat de omzet van een Kermis bijhoudt.
De Kermis heeft een zestal attracties, die zijn allemaal subclasse van een klasse Attractie.

Zodra het programma start kan er een getal worden ingegeven,
1 voor botsauto's,
2 voor spin,
3 voor spiegelpaleis,
4 voor spookhuis,
5 voor hawaii,
6 voor ladderklimmen.

<h2>Stap 1:</h2>

Zorg dat het bovenstaande stabiel werkt en dat iedere keer dat het getal wordt ingegeven er getoond wordt welke attractie draait.

Aangenomen is dat je dit realiseert door een methode van een object aan te roepen, dus: attractie.draaien(); ipv System.out.println("de attractie draait"); In de methode draaien van de attractie mag System.out.println("de attractie '' draait"); natuurlijk wel gebruikt worden.

Iedere attractie heeft een naam, een prijs en een oppervlakte.

<h2>Stap 2:</h2>
Botsauto's kosten 2.50,
Spin 2.25,
Spiegelpaleis 2.75,
Spookhuis 3.20,
Hawaii 2.90 en
Ladderklimmen 5.00.

Houdt in een centraal object Kassa bij wat de omzet is van de hele kermis.
Houdt in iedere attractie bij hoeveel omzet elke attractie draait.
Ook willen we weten hoe vaak er kaartjes per attractie zijn gekocht, en natuurlijk voor de attracties in het totaal.
Met de invoer van de letter "o" zien we de omzet. Met de invoer van de letter "k" zien we het aantal kaartjes.

<h2>Stap 3:</h2>
Spin en Hawaii zijn zgn RisicoRijkeAttracties.
RisicoRijkeAttracties moeten een keuring ondergaan nadat ze opgesteld zijn. Deze methode heet dus opstellingsKeuring().

RisicoRijkeAttracties hebben een draaiLimiet. Dit is het aantal maal dat ze mogen draaien voordat er een onderhoudsbeurt moet plaatsvinden. Voor de Spin is dit 5 en voor de Hawaii is dit 10. In deze stap mag de onderhoudsbeurt nog handmatig worden aangeroepen.

LadderKlimmen is een GokAttractie.
GokAttracties moeten kansSpelBelastingBetalen(). De kansSpelBelasting is het reserveren van 30% over je omzet.
Implementeer de RisicoRijkeAttracties met behulp van Abstracte Klassen.

Implementeer de GokAttractie via een interface.

<h2>Stap 4:</h2>
Maak een Klasse BelastingInspecteur.
Maak OF een input voor een bezoek van de BelastingInspecteur, bv 'b'.
OF maak een random die 1 keer per 15 verkopen ervoor zorgt dat de BelastingInspecteur langskomt.

De belastingInspecteur haalt meteen zijn belasting uit de omzet.
De kassa moet natuurlijk bijhouden dat er een bezoek van de BelastingInspecteur is geweest.
Een belasting inspecteur checkt van alle attracties of die van het Type GokAttractie zijn.

Alleen voor Gokattracties wordt belasting geheven, de andere niet.
Tenslotte maken we de Spin ook een GokAttractie om te kijken of ons Ontwerp goed werkt.

<h2>Stap 5:</h2>
We gaan onze Kermis applicatie een stuk robuuster maken.

In plaats van de de applicatie-bediener zelf moet bijhouden of de Spin of Hawaii al over zijn 5 of 10 ritjes zit, gaat de applicatie dit bijhouden.
Op het moment dat er een 6e of 11e kaartje wordt verkocht, throwt de Attractie een Exception.

De applicatieBediener kan een monteur aanroepen mbv van de knop 'm'. Die doet zijn keuring en reset de attractie.


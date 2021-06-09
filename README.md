# Hike
Java project for TietoEVRY internship.
Projektą galima paleisti naudojant tomcat HTTP serverį.
Norint įvesti pradinius duomenis ir gauti atsakymą reikia siųsti užklausą pagal šią nuorodą:
http://localhost:8080/Hike_war_exploded/hike/{distance}/{season}/{numberOfPeople}/{numberOfPets}.
{distance} - Žygio atstumas kilometrais, reikia pakeisti į sveiką teigiamą skaičių, pvž: 100.
{season} - Metų laikas, reikia įvesti vieną iš šių sezonų: Summer/Spring/Autumn/Winter.
{numberOfPeople} - Žmonių dalyvaujančių žygyje skaičius, reikia pakeisti į sveiką teigiamą skaičių, pvž: 2.
{numberOfPets} - Augintinių dalyvaujančių žygyje skaičius, reikia pakeisti į betkokį sveiką skaičių kuris yra 0, arba daugiau, pvž: 1.
Nuorodos pavyzdys:
http://localhost:8080/Hike_war_exploded/hike/100/Autumn/2/1

Programa grąžins atsakymą JSON formatu
Atsakyme pateikti šie rezultatai: atstumas; žmonių skaičius; augintinių skaičius; apskaičiuta žygio trukmė dienomis; apskaičiuotas reikalingas maisto kiekis dienomis,
kiekvienam žmogui; apskaičiuotas reikalingas maisto kiekis dienomis, kiekvienam augintiniui; reikalingas daiktas, reikalingas priklausomai nuo metų laiko.

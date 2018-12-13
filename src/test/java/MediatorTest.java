public class MediatorTest {


    //Tester connexion ORACLE

    public void testConnexionToOracle(){}
    //Tester ouverture fichier XML
    public void testOpenXMLFile(){}
    //Tester ouverture fichier Excel
    public void testOpenExcelFile(){}


    //Tester déconnexion ORACLE
    public void testDeconnexionToOracle(){}
    //Tester fermeture fichier XML
    public void testCloseXMLFile(){}
    //Tester fermeture fichier Excel
    public void testCloseExcelFile(){}



    //Tester la réception de la requête du mediateur par l'extacteur ORACLE
    // Générer une table de correspondance entre la source et le médiateur pour décrire le template des attributs
    public void testReceivingMediatorRequestByORACLEExtractor(){}
    //Tester la réception de la requête du mediateur par l'extacteur XML
    // Générer une table de correspondance entre la source et le médiateur pour décrire le template des attributs
    public void testReceivingMediatorRequestByXMLExtractor(){}
    //Tester la réception de la requête du mediateur par l'extacteur EXCEL
    // Générer une table de correspondance entre la source et le médiateur pour décrire le template des attributs
    public void testReceivingMediatorRequestByEXCELExtractor(){}




    //Traduction de la requête (vue) du médiateur par le schéma de la source
    //(en parcourant la table de correspondance générée par le générateur d’adaptateur)
    //Recherche du template qui correspond à la requête du médiateur
    //ORACLE
    public void testRequestTranslationORACLE(){}
    //Traduction de la requête (vue) du médiateur par le schéma de la source
    //(en parcourant la table de correspondance générée par le générateur d’adaptateur)
    //Recherche du template qui correspond à la requête du médiateur
    //XML
    public void testRequestTranslationXML(){}
    //Traduction de la requête (vue) du médiateur par le schéma de la source
    //(en parcourant la table de correspondance générée par le générateur d’adaptateur)
    //Recherche du template qui correspond à la requête du médiateur
    //EXCEL
    public void testRequestTranslationExcel(){}


    //Récupération du résultat de la requête sur ORACLE
    public void testGetResultsORACLE(){}
    //Récupération du résultat de la requête sur XML
    public void testGetResultsXML(){}
    //Récupération du résultat de la requête sur EXCEL
    public void testGetResultsEXCEL(){}



    //Traduction du résultat de la source ORACLE l’envoyer au médiateur
    public void testResultTranslationORACLEToMediator(){}
    //Traduction du résultat de la source XML l’envoyer au médiateur
    public void testResultTranslationXMLToMediator(){}
    //Traduction du résultat de la source EXCEL l’envoyer au médiateur
    public void testResultTranslationEXCELToMediator(){}






    //Exécution (interrogation de la source) des requêtes du médiateur sur la source ORACLE
    public void testRequestExecutionORACLE (){}
    //Exécution (interrogation de la source) des requêtes du médiateur sur la source XML
    public void testRequestExecutionXML (){}
    //Exécution (interrogation de la source) des requêtes du médiateur sur la source Excel
    public void testRequestExecutionExcel (){}





    //Définition des requêtes (vues) en se basant sur le dictionnaire de données du schéma global du médiateur
    public void testDefineMediatorRequest(){}
    //Envoyer les requêtes aux sources de données
    public void sendRequestsToExtractors(){}
    //Récupération des résultats des 3 sources;
    public void testGetResultsFromAllSources(){}
    //Agregatioj des résultats des 3 sources
    public void testResultsAgregation(){}







    //	Afficher pour chaque enseignant, son nombre total d’heures assurées.
    public void testHoursPerTeacher(){}
    //Retourner le nombre d’étudiants dont le pays de Provenance est la ‘France’.
    public void testNbStudentsFromFrance(){}
    //	Afficher le nombre de cours par Type (CM, TD ou TP).
    public void testNbCoursesByType(){}

}

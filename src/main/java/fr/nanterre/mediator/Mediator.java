package fr.nanterre.mediator;

import fr.nanterre.model.Enseignant;

public interface Mediator {
    //Afficher pour chaque enseignant, son nombre total d’heures assurées.
    public void hoursPerTeacher(Enseignant enseignant);
    //Retourner le nombre d’étudiants dont le pays de Provenance est la ‘France’.
    public void nbStudentsFromFrance();
    //Afficher le nombre de cours par Type (CM, TD ou TP).
    public void nbCoursesByType();
}

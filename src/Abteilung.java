import java.util.ArrayList;
import java.util.List;

public class Abteilung {
    String name;
    List<Person>personList=new ArrayList<>();
    public Abteilung(String name){
        this.name=name;
    }
    public void Personeinfugen(Person person){
        //prüfen ob man schon in list ist.
        if(personList.stream().anyMatch(p -> p.vorname.equals(person.vorname))){
            //wenn ja

        }
        else {
            //wenn nein,fügen ein new Person
            personList.add(person);
        }
    }
    //Löschen Person, wenn Vorname gleich wie Valiable
    public void PersonLochen(String email){
        personList.removeIf(p->p.email.equals((email)));
    }

}


package edu.eci.cvds.tdd.registry;

public class Duplicated implements InterfaceVoter{
    private InterfaceVoter next;

    public Duplicated(InterfaceVoter next){
        this.next=next;
    }

    @Override
    public RegisterResult evalVoter(Person p) {
        if(validateId(p)){
            return RegisterResult.DUPLICATED;
        } else {
            return next.evalVoter(p);
        }
    }

    private boolean validateId(Person p){
        if(Registry.personasRegistradas.contains(p.getId())){
            return true;
        }
        else{
            return false;
        }
    }
}
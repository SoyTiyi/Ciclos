package edu.eci.cvds.tdd.registry;

public class Duplicated implements InterfaceVoter{
    private InterfaceVoter next;

    public Duplicated(InterfaceVoter next){
        this.next=next;
    }

    @Override
    public RegisterResult evalVoter(Person p) {
        if(!p.isAlive()){
            return RegisterResult.DEAD;
        } else {
            return next.evalVoter(p);
        }
    }
}
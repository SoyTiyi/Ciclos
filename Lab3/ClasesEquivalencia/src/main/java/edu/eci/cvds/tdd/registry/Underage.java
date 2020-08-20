package edu.eci.cvds.tdd.registry;

public class Underage implements InterfaceVoter{
    private InterfaceVoter next;

    public Underage(InterfaceVoter next){
        this.next=next;
    }

    @Override
    public RegisterResult evalVoter(Person p) {
        if(p.getAge()<18){
            return RegisterResult.UNDERAGE;
        } else {
            return next.evalVoter(p);
        }
    }
}
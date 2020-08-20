package edu.eci.cvds.tdd.registry;

public class Dead implements InterfaceVoter {

    private InterfaceVoter next;

    public Dead(InterfaceVoter next){
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
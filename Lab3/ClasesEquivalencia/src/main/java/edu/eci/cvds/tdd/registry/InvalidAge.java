package edu.eci.cvds.tdd.registry;

public class InvalidAge implements InterfaceVoter{
    private InterfaceVoter next;

    public InvalidAge(InterfaceVoter next){
        this.next=next;
    }

    @Override
    public RegisterResult evalVoter(Person p) {
        if(p.getAge()<=0){
            return RegisterResult.INVALID_AGE;
        } else {
            return next.evalVoter(p);
        }
    }
}
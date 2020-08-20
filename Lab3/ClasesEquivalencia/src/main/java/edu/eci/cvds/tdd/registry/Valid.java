package edu.eci.cvds.tdd.registry;

public class Valid implements InterfaceVoter{

    public Valid(){}

    @Override
    public RegisterResult evalVoter(Person p) {
        Registry.personasRegistradas.add(p.getId());
        return RegisterResult.VALID;
    }
    
}
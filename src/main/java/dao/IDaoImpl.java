package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        return Math.random()*40;
    }
}
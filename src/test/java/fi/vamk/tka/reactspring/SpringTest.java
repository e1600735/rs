package fi.vamk.tka.reactspring;

import org.junit.Test;
import org.junit.runner.RunWith;
import fi.vamk.tka.reactspring.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaRepositories(basePackageClasses = GroupRepository.class) // assuming you have all the spring data repo in the same package.
public class SpringTest{
    @Autowired
    private GroupRepository repository;
    @Test
    public void addingGroupTest(){
        Group item = new Group();
        item.setName("Vaasa JUG");
        repository.save(item);
        System.out.println("onko kevät koittanut");
    }

    @Test
    public void helloyouTest(){
        System.out.println("onko kesä koittanut");
    }


}
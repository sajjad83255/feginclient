package fegin;

import com.wipro.Employee_Service.client.Project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Project-service",url="http://localhost:9098/project")
public interface ProjectClient {

    @GetMapping("company/{pcode}")
    List<Project> findProjectByPcode(@PathVariable("pcode") Long pcode);
}
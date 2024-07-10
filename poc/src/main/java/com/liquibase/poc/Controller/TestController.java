

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    public String addSchool(@RequestBody School school ){
        return this.testService.addSchool(school);
    }


}
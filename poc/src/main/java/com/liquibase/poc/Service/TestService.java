

@Service
public class TestService{

    @Autowired
    TestRepository testRepository;

    public String addSchool(School school){

        testRepository.save(school);
        return "School added Successfully";
    }
}
@Controller
public class CandidatosTseController {
    private final CandidatosTseService candidatosTseService;

    public CandidatosTseController(CandidatosTseService candidatosTseService){
        this.candidatosTseService = candidatosTseService;
    }

   @GetMapping("/")
   public String index(
    @RequestParam(required = false) String genero,
    @RequestParam(required = false) String escolaridade,
    @RequestParam(required = false) String idadeMin,
    @RequestParam(required = false) String idadeMax,
    Model model {
        model.addAttribute("message", "Texto");
        return "/";
    }
   )
}

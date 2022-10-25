import java.com.person.dto.PersonDetailsDTO;
import java.com.person.service.PersonDetailsServiceImpl;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetailsDTO dto=new PersonDetailsDTO(77,"nagesh","nageshkoppad@gmail.com",901937,"male","engineering","unmarreid","software developer","google",150000,26,3,"btm layout","bangalore","karnataka","india",245515,548,"alive",8455145);
		PersonDetailsServiceImpl impl=new PersonDetailsServiceImpl();
		impl.ValidateAndSave(dto);
	}

}

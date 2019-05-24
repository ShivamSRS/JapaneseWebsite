/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japensemultilingualapi;

import java.sql.SQLException;
import java.util.List;
public class JapenseMultilingualApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        getEnglishWord();
    }

    private static void getEnglishWord() {
        Fetch f1=new Fetch();
        List<Coverter> coveter;
		try {
			coveter = f1.getEnglishWord();
			for (Coverter employee : coveter) {
				displayData(employee);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
    }
    
    
	private static void displayData(Coverter on) {
		System.out.println("Word ID:" + on.getId());
		System.out.println("Word :" + on.getEnglishWord());


	}
    
}

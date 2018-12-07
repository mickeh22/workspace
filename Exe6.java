/**
 *  Arraylistor importeras
 */
import java.util.Arrays;
/**
 *  Denna klass f�r namnet 
 */
public class Exe6 {
	/**
	 *  Arraylistor skapas och blir tilldelade namn
	 */
	int[] firstArray;
	int[] secondArray;
	int[] mergedArray;

	/**
	 *  Exe6 blir �ppen och tillg�nglig
	 */
	public Exe6(){

	}
	/**
	 *  Attribut med getters som h�mtar private f�lt and setters som kan �ndra instansvariabler.
	 * @return 
	 */
	public int[] getFirstArray() {
		return firstArray;
		/**
		 * s�tter f�rsta arrayen och med kommandot this som anv�nds f�r att l�ta en konstruktor anropa en anna konstruktor
		 */
	}
	public void setFirstArray(int[] firstArray) {
		this.firstArray = firstArray;
		/**
		 * anv�nder kommadot return f�r att anropa Exe7
		 */
	}
	public int[] getSecondArray() {
		return secondArray;

	}
	/**
	 * second array med kommandot "this" som i tydlig indikerar variabelrefrensen i detta sammanhang
	 * @param secondArray
	 */

	public void setSecondArray(int[] secondArray) {
		this.secondArray = secondArray;

	}
	/**
	 * @return
	 */
	public int[] getMergedArray() {
		return mergedArray;

	}
	public void setMergedArray(int[] mergedArray) {
		this.mergedArray = mergedArray;

	}
	/**
	 * sammanfogade array listor index med heltal skapas och indelas
	 * @param array1
	 * @param array2
	 * @return
	 */
	public int[] mergedarray1 (int[] array1, int[] array2) {

		int indexarray1 = 0;
		int indexarray2 = 0;
		int indexarray3 = 0;

		/**
		 * listorna sammanst�lls och med best�md l�ngd
		 */
		int[]array3 = new int[array1.length + array2.length]; 
		int[] array4 = new int[array3.length];
		/**
		 * * En for loop skapas och indexarray f�r v�rde 0 s� de inte innehar n�got annat v�rde
		 */
		for(indexarray1 = 0; indexarray1< array1.length; indexarray1++){
			array3[indexarray3] = array1[indexarray1];
			indexarray3++; 
			/**
			 * Indexarryer tills�ts med length 
			 */
		}
		for(indexarray2 = 0; indexarray2< array2.length; indexarray2++){
			array3[indexarray3] = array2[indexarray2];
			indexarray3++; 

		}

		Arrays.sort(array3);

		if(array3.length>0){
			array4[0]=array3[0];
		}
		return array3;




	}	

}



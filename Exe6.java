/**
 *  Arraylistor importeras
 */
import java.util.Arrays;
/**
 *  Denna klass får namnet 
 */
public class Exe6 {
	/**
	 *  Arraylistor skapas och blir tilldelade namn
	 */
	int[] firstArray;
	int[] secondArray;
	int[] mergedArray;

	/**
	 *  Exe6 blir öppen och tillgänglig
	 */
	public Exe6(){

	}
	/**
	 *  Attribut med getters som hämtar private fält and setters som kan ändra instansvariabler.
	 * @return 
	 */
	public int[] getFirstArray() {
		return firstArray;
		/**
		 * sätter första arrayen och med kommandot this som används för att låta en konstruktor anropa en anna konstruktor
		 */
	}
	public void setFirstArray(int[] firstArray) {
		this.firstArray = firstArray;
		/**
		 * använder kommadot return för att anropa Exe7
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
		 * listorna sammanställs och med bestämd längd
		 */
		int[]array3 = new int[array1.length + array2.length]; 
		int[] array4 = new int[array3.length];
		/**
		 * * En for loop skapas och indexarray får värde 0 så de inte innehar något annat värde
		 */
		for(indexarray1 = 0; indexarray1< array1.length; indexarray1++){
			array3[indexarray3] = array1[indexarray1];
			indexarray3++; 
			/**
			 * Indexarryer tillsäts med length 
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



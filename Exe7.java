/**
 * namnet p� uppgiften
 */
public class Exe7 {
	/**
	 * @param args som s�ger att main har en parameter
	 */
	public static void main(String[] args) {


		Exe6 obliga6 = new Exe6();

		/**
		 * Tv� arraylistor skapas s� jag kan l�gga in flera siffror. 
		 */

		int []Array1 = {1,2,3,4,5}; 
		int []Array2 = {2,3,6,5,9,8}; 

		/**
		 * h�r h�mtas och knyts arraylistorna exmpelvis get first array som skapades i Javaprgrammet Exe6
		 */
		obliga6.setFirstArray(Array1);
		obliga6.setSecondArray(Array2);
		int []temporaryArray = obliga6.mergedarray1(obliga6.getFirstArray(),obliga6.getSecondArray());
		/**
		 * Tills�tter merged array eftersom de m�ste knytas samman med en ny object array.
		 */
		obliga6.setMergedArray(temporaryArray);


		temporaryArray = java.util.stream.IntStream.of(temporaryArray).distinct().toArray();
		for (int i =0; i<temporaryArray.length;i++){
			System.out.print(temporaryArray[i]);

		}

	}

}

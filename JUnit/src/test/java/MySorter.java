public class MySorter {
	public double[] sort(double[] d) {
		if (d.length == 0) {
			double[] d2 = { 0.0 };
			return d2;
		} else {
			for (int i = 0; i < d.length - 1; i++) {
				for (int j = 0; j < d.length - i - 1; j++) {
					if (d[j] > d[j + 1]) {
						swap(d, j, j + 1);
					}
				}
			}
			return d;
		}

	}

	public void swap(double d[], int k, int s) {
		double temp = d[k];
		d[k] = d[s];
		d[s] = temp;
	}
}

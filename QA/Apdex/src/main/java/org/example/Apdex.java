// Oscar Arias Neto Rm556936
package org.example;

public class Apdex {

        private int s;
        private int to;
        private int ta;

        public Apdex(int s, int to, int ta) {
            this.s = s;
            this.to = to;
            this.ta = ta;
        }

        public float calcularApdex() {
            int total = s + to + ta;
            return (float) (s + (to / 2.0)) / total;
        }

}

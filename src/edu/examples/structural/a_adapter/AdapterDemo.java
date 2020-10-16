package edu.examples.structural.a_adapter;

import edu.examples.structural.a_adapter.adapters.SquarePegAdapter;
import edu.examples.structural.a_adapter.round.RoundHole;
import edu.examples.structural.a_adapter.round.RoundPeg;
import edu.examples.structural.a_adapter.square.SquarePeg;

/**
 * Examples from the real world:
 *  - java.util.Arrays#asList()
 *  - java.util.Collections#list()
 *  - java.util.Collections#enumeration()
 *  - java.io.InputStreamReader(InputStream) (returns a Reader object)
 *  - java.io.OutputStreamWriter(OutputStream) (returns a Writer object)
 *  - javax.xml.bind.annotation.adapters.XmlAdapter#marshal() and #unmarshal()
 */
public class AdapterDemo {

    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }

}

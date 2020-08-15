package com.example.imscbit

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [physics_sem_1.newInstance] factory method to
 * create an instance of this fragment.
 */
val modules51= arrayOf("Time dependent Schrodinger equation\n" +
        "Time dependent Schrodinger equation and dynamical evolution of a quantum state; Properties of\n" +
        "Wave Function. Interpretation of Wave Function Probability and probability current densities in\n" +
        "three dimensions; Conditions for Physical Acceptability of Wave Functions. Normalization.\n" +
        "Linearity and Superposition Principles. Eigenvalues and Eigenfunctions. Position, momentum and\n" +
        "Energy operators; commutator of position and momentum operators; Expectation values of\n" +
        "position and momentum. Wave Function of a Free Particle.",
    "Time independent Schrodinger equation\n" +
            "Hamiltonian, stationary states and energy eigenvalues; expansion of an arbitrary wavefunction as a\n" +
            "linear combination of energy eigenfunctions; General solution of the time dependent Schrodinger\n" +
            "equation in terms of linear combinations of stationary states; Application to spread of Gaussian\n" +
            "wave-packet for a free particle in one dimension; wave packets, Fourier transforms and momentum\n" +
            "space wavefunction; Position-momentum uncertainty principle.",
    "General discussion of bound states in an arbitrary potential\n" +
            "continuity of wave function, boundary condition and emergence of discrete energy levels;\n" +
            "application to one-dimensional problem-square well potential; Quantum mechanics of simple\n" +
            "harmonic oscillator-energy levels and energy eigenfunctions using Frobenius method; Hermite\n" +
            "polynomials; ground state, zero point energy & uncertainty principle.",
    "Quantum theory of hydrogen-like atoms\n" +
            "time independent Schrodinger equation in spherical polar coordinates; separation of variables for\n" +
            "second order partial differential equation; angular momentum operator & quantum numbers;\n" +
            "Radial wavefunctions from Frobenius method; shapes of the probability densities for ground &\n" +
            "first excited states; Orbital angular momentum quantum numbers l and m; s, p, d,.. shells.",
    "Atoms in Electric & Magnetic Fields\n" +
            "Electron angular momentum. Space quantization. Electron Spin and Spin Angular Momentum.\n" +
            "Larmor’s Theorem. Spin Magnetic Moment. Stern-Gerlach Experiment. Zeeman Effect: Electron\n" +
            "Magnetic Moment and Magnetic Energy, Gyromagnetic Ratio and Bohr Magneton. Normal and\n" +
            "Anomalous Zeeman Effect. Paschen Back and Stark Effect (Qualitative Discussion only). Pauli’s\n" +
            "Exclusion Principle. Symmetric & Antisymmetric Wave Functions. Periodic table. Fine structure.\n" +
            "Spin orbit coupling. Spectral Notations for Atomic States. Total angular momentum. Vector\n" +
            "Model. Spin-orbit coupling in atoms L-S and J-J couplings. Hund’s Rule. Term symbols. Spectra\n" +
            "of Hydrogen and Alkali Atoms (Na etc.).")
val refbooks51= arrayOf(
    "1. A Text book of Quantum Mechanics, P.M.Mathews and K.Venkatesan, 2nd Ed., 2010, McGraw Hill\n" +
            "2. Quantum Mechanics, Robert Eisberg and Robert Resnick, 2nd Edn., 2002, Wiley.\n" +
            "3. Quantum Mechanics, Leonard I. Schiff, 3rd Edn. 2010, Tata McGraw Hill.\n" +
            "4. Quantum Mechanics, G. Aruldhas, 2nd Edn. 2002, PHI Learning of India.\n" +
            "5. Quantum Mechanics, Bruce Cameron Reed, 2008, Jones and Bartlett Learning.\n" +
            "6. Quantum Mechanics: Foundations & Applications, Arno Bohm, 3rd Edn., 1993, Springer\n" +
            "7. Quantum Mechanics for Scientists & Engineers, D.A.B. Miller, 2008, Cambridge University Press",
    "1. Quantum Mechanics, Eugen Merzbacher, 2004, John Wiley and Sons, Inc.\n" +
            "2. Introduction to Quantum Mechanics, D.J. Griffith, 2nd Ed. 2005, Pearson Education\n" +
            "3. Quantum Mechanics, Walter Greiner, 4th Edn., 2001, Springer")
val modules52= arrayOf("Crystal Structure: Solids: Amorphous and Crystalline Materials. Lattice Translation Vectors.\n" +
        "Lattice with a Basis – Central and Non-Central Elements. Unit Cell. Miller Indices. Reciprocal\n" +
        "Lattice. Types of Lattices. Brillouin Zones. Diffraction of X-rays by Crystals. Bragg’s Law. Atomic\n" +
        "and Geometrical Factor",
    "Elementary Lattice Dynamics: Lattice Vibrations and Phonons: Linear Monoatomic and Diatomic\n" +
            "Chains. Acoustical and Optical Phonons. Qualitative Description of the Phonon Spectrum in Solids.\n" +
            "Dulong and Petit’s Law, Einstein and Debye theories of specific heat of solids. T3 law",
    "Magnetic Properties of Matter: Dia-, Para-, Ferri- and Ferromagnetic Materials. Classical\n" +
            "Langevin Theory of dia– and Paramagnetic Domains. Quantum Mechanical Treatment of\n" +
            "Paramagnetism. Curie’s law, Weiss’s Theory of Ferromagnetism and Ferromagnetic Domains.\n" +
            "Discussion of B-H Curve. Hysteresis and Energy Loss.\n" +
            "Dielectric Properties of Materials: Polarization. Local Electric Field at an Atom. Depolarization\n" +
            "Field. Electric Susceptibility. Polarizability. Clausius Mosotti Equation. Classical Theory of Electric\n" +
            "Polarizability. Normal and Anomalous Dispersion. Cauchy and Sellmeir relations. Langevin-Debye\n" +
            "equation. Complex Dielectric Constant. Optical Phenomena. Application: Plasma Oscillations,\n" +
            "Plasma Frequency, Plasmons, TO modes",
    "Ferroelectric Properties of Materials: Structural phase transition, Classification of crystals,\n" +
            "Piezoelectric effect, Pyroelectric effect, Ferroelectric effect, Electrostrictive effect, Curie-Weiss Law,\n" +
            "Ferroelectric domains, PE hysteresis loop.\n" +
            "Elementary band theory: Kronig Penny model. Band Gap. Conductor, Semiconductor (P and N type) and insulator. Conductivity of Semiconductor, mobility, Hall Effect. Measurement of\n" +
            "conductivity (04 probe method) & Hall coefficient.",
    "Superconductivity: Experimental Results. Critical Temperature. Critical magnetic field. Meissner\n" +
            "effect. Type I and type II Superconductors, London’s Equation and Penetration Depth. Isotope\n" +
            "effect. Idea of BCS theory (No derivation)")
val refbooks52= arrayOf(
    "1. Introduction to Solid State Physics, Charles Kittel, 8th Edition, 2004, Wiley India Pvt. Ltd.\n" +
            "2. Solid State Physics, N.W. Ashcroft and N.D. Mermin, 1976, Cengage Learning\n" +
            "3. Elementary Solid State Physics, 1/e M. Ali Omar, 1999, Pearson India",
    "1. Elements of Solid State Physics, J.P. Srivastava, 4th Edition, 2015, Prentice-Hall of India\n" +
            "2. Introduction to Solids, Leonid V. Azaroff, 2004, Tata Mc-Graw Hill\n" +
            "3. Solid-state Physics, H. Ibach and H. Luth, 2009, Springer\n" +
            "4. Solid State Physics, Rita John, 2014, McGraw Hill\n" +
            "5. Solid State Physics, M.A. Wahab, 2011, Narosa Publications")
val modules53= arrayOf("Axioms of probability, Probability space, Conditional probability, Independent events, Bayes' theorem,\n" +
        "discrete and continuous random variables, Cumulative distribution function, probability mass and density\n" +
        "functions, mathematical expectation, variance, moment generating function. ",
    "Discrete and continuous probability distributions such as Bernoulli, Binomial, Negative Binomial,\n" +
            "Poisson, Uniform, Exponential, Beta, Gamma and Normal distribution, distribution of function of random\n" +
            "variable. Covariance, Correlation and regression Analysis.",
    "Joint distribution for two dimensional random variables, marginal distributions, conditional distributions,\n" +
            "conditional expectation, conditional variance, independence of random variables, distribution of sum of\n" +
            "two independent random variables. The Central Limit Theorem, t-distribution, Chi-Square Distribution,\n" +
            "F- Distribution.",
    "Point Estimation and Interval Estimation, Interval Estimation of three Common Parameters: mean,\n" +
            "variance and proportion. The method of moments and the method of maximum likelihood estimation,\n" +
            "confidence intervals for the mean(s) and variance(s) of normal populations. ",
    "Testing of Statistical hypothesis: Null and alternative hypotheses, the critical and acceptance regions, two\n" +
            "types of error, tests involving a population mean, tests involving a population proportion, tests involving\n" +
            "a population variance, tests for two population means, tests for two population proportions, tests for two\n" +
            "population variance. ")
val refbooks53= arrayOf(
    "1. Johnson R.A, Miller I. and Freund J.: Probability and Statistics for Engineers, PHI\n" +
            "2. Hogg, R.V. and Tanis E.A.: Probability and Statistical Inference, Pearson\n" +
            "3. Pal N. and Sarkar S.: Statistics: Concepts and Applications, PHI\n" +
            "4. Gupta S.C and Kapoor V.K.: Fundamental of Mathematical Statistics, Sultan Chand and Sons\n" +
            "5. Walpole, R.E., Myers, R.E., Myers R.H., Myers S.L. and Ye K.: Probability for Statistics and\n" +
            "Engineers, Pearson",
    "1. Feller W.: Introduction to Probability theory and applications, John Wiley\n" +

            "2. Freund J.E.: Mathematical Statistics, Pearson\n" +
            "3. Meyer P.L.: Introductory Probability and Statistical Applications, Oxford & IBH,\n" +
            "4. Hines W., Montgomery D., Goldsman, D. and Borror, C.: Probability & Statistics in Engineering,\n" +
            "John Wiley")
class Physics_sem_5 : Fragment() {
    // TODO: Rename and change types of parameters



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_physics_sem_5, container, false)
        val button1 = view.findViewById<Button>(R.id.sem5_sub1)
        val button2 = view.findViewById<Button>(R.id.sem5_sub2)
        val button3 = view.findViewById<Button>(R.id.sem5_sub4)
        val button4 = view.findViewById<Button>(R.id.sem5_sub5)
        val button5 = view.findViewById<Button>(R.id.sem5_sub3)
        button1.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules51)
            intent.putExtra("books", refbooks51)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules52)
            intent.putExtra("books", refbooks52)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(activity, Physics_PE_I::class.java)

            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(activity, Physics_PE_II::class.java)

            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules53)
            intent.putExtra("books", refbooks53)
            startActivity(intent)
        }
        return view
    }

    companion object {

        fun newInstance(): Physics_sem_5=Physics_sem_5()
    }
}
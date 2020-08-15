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
val modules31= arrayOf("Introduction to Thermodynamics\n" +
        "Zeroth and First Law of Thermodynamics: Extensive and intensive Thermodynamic Variables,\n" +
        "Thermodynamic Equilibrium, Zeroth Law of Thermodynamics & Concept of Temperature,\n" +
        "Concept of Work & Heat, State Functions, First Law of Thermodynamics and its differential form,\n" +
        "Internal Energy, First Law & various processes, Applications of First Law: General Relation\n" +
        "between CP and CV, Work Done during Isothermal and Adiabatic Processes, Compressibility and\n" +
        "Expansion Co-efficient.\n" +
        "Second Law of Thermodynamics: Reversible and Irreversible process with examples.\n" +
        "Conversion of Work into Heat and Heat into Work. Heat Engines. Carnot’s Cycle, Carnot engine\n" +
        "& efficiency. Refrigerator & coefficient of performance, 2nd Law of Thermodynamics: Kelvin-\n" +
        "Planck and Clausius Statements and their Equivalence. Carnot’s Theorem. Applications of\n" +
        "Second Law of Thermodynamics: Thermodynamic Scale of Temperature and its Equivalence to\n" +
        "Perfect Gas Scale.",
    "Entropy: Concept of Entropy, Clausius Theorem. Clausius Inequality, Second Law of\n" +
            "Thermodynamics in terms of Entropy. Entropy of a perfect gas. Principle of Increase of Entropy.\n" +
            "Entropy Changes in Reversible and Irreversible processes with examples. Entropy of the Universe.\n" +
            "Entropy Changes in Reversible and Irreversible Processes. Principle of Increase of Entropy.\n" +
            "Temperature–Entropy diagrams for Carnot’s Cycle. Third Law of Thermodynamics.\n" +
            "Unattainability of Absolute Zero.\n" +
            "Thermodynamic Potentials: Thermodynamic Potentials: Internal Energy, Enthalpy, Helmholtz\n" +
            "Free Energy, Gibb’s Free Energy. Their Definitions, Properties and Applications. Surface Films\n" +
            "and Variation of Surface Tension with Temperature. Magnetic Work, Cooling due to adiabatic\n" +
            "demagnetization, First and second order Phase Transitions with examples, Clausius Clapeyron\n" +
            "Equation and Ehrenfest equations",
    "Maxwell’s Thermodynamic Relations: Derivations and applications of Maxwell’s Relations,\n" +
            "Maxwell’s Relations:(1) Clausius Clapeyron equation, (2) Values of Cp-Cv, (3) TdS Equations, (4)\n" +
            "Joule-Kelvin coefficient for Ideal and Van der Waal Gases, (5) Energy equations, (6) Change of\n" +
            "Temperature during Adiabatic Process.",
    "Kinetic Theory of Gases\n" +
            "Distribution of Velocities: Maxwell-Boltzmann Law of Distribution of Velocities in an Ideal\n" +
            "Gas and its Experimental Verification. Doppler Broadening of Spectral Lines and Stern’s\n" +
            "Experiment. Mean, RMS and Most Probable Speeds. Degrees of Freedom. Law of Equipartition\n" +
            "of Energy (No proof required). Specific heats of Gases.\n" +
            "Molecular Collisions: Mean Free Path. Collision Probability. Estimates of Mean FreePath.\n" +
            "Transport Phenomenon in Ideal Gases: (1) Viscosity, (2) Thermal Conductivity and (3)\n" +
            "Diffusion. Brownian Motion and its Significance",
    "Real Gases: Behavior of Real Gases: Deviations from the Ideal Gas Equation. The Virial\n" +
            "Equation. Andrew’s Experiments on CO2 Gas. Critical Constants. Continuity of Liquid and\n" +
            "Gaseous State. Vapour and Gas. Boyle Temperature. Van der Waal’s Equation of State for Real\n" +
            "Gases. Values of Critical Constants. Law of Corresponding States. Comparison with\n" +
            "Experimental Curves. P-V Diagrams. Joule’s Experiment. Free Adiabatic Expansion of a Perfect\n" +
            "Gas. Joule-Thomson Porous Plug Experiment. Joule-Thomson Effect for Real and Van der Waal\n" +
            "Gases. Temperature of Inversion. Joule- Thomson Cooling.")
val refbooks31= arrayOf(
    "T1: Heat and Thermodynamics, M.W. Zemansky, Richard Dittman, 1981, McGraw-Hill.\n" +
            "T2: A Treatise on Heat, Meghnad Saha, and B.N.Srivastava, 1958, Indian Press",
    "R1: Thermal Physics, S. Garg, R. Bansal and Ghosh, 2nd Edition, 1993, Tata McGraw-Hill\n" +
            "R2: Modern Thermodynamics with Statistical Mechanics, Carl S. Helrich, 2009, Springer.\n" +
            "R3: Thermodynamics, Kinetic Theory & Statistical Thermodynamics, Sears & Salinger. 1988, Narosa.\n" +
            "R4: Concepts in Thermal Physics, S.J. Blundell and K.M. Blundell, 2nd Ed., 2012, Oxford University Press\n" +
            "R5: Thermal Physics, A. Kumar and S.P. Taneja, 2014, R. Chand Publications.")
val modules32= arrayOf("Introduction to CRO: Block Diagram of CRO. Electron Gun, Deflection System and Time Base.\n" +
        "Deflection Sensitivity. Applications of CRO: (1) Study of Waveform, (2) Measurement of Voltage,\n" +
        "Current, Frequency, and Phase Difference.\n" +
        "Integrated Circuits (Qualitative treatment only): Active & Passive components. Discrete components.\n" +
        "Wafer. Chip. Advantages and drawbacks of ICs. Scale of integration: SSI, MSI, LSI and VLSI (basic\n" +
        "idea and definitions only). Classification of ICs. Examples of Linear and Digital lCs.",
    "Digital Circuits: Difference between Analog and Digital Circuits. Binary Numbers. Decimal to Binary\n" +
            "and Binary to Decimal Conversion. BCD, Octal and Hexadecimal numbers. AND, OR and NOT Gates\n" +
            "(realization using Diodes and Transistor). NAND and NOR Gates as Universal Gates. XOR and XNOR\n" +
            "Gates and application as Parity Checkers.\n" +
            "Boolean algebra: De Morgan's Theorems. Boolean Laws. Simplification of Logic Circuit using Boolean\n" +
            "Algebra. Fundamental Products. Idea of Minterms and Maxterms. Conversion of a Truth table into\n" +
            "Equivalent Logic Circuit by (1) Sum of Products Method and (2) Karnaugh Map.",
    "Data processing circuits: Basic idea of Multiplexers, De-multiplexers, Decoders, Encoders.\n" +
            "Arithmetic Circuits: Binary Addition. Binary Subtraction using 2's Complement. Half and Full Adders.\n" +
            "Half & Full Subtractors, 4-bit binary Adder/Subtractor.\n" +
            "Sequential Circuits: SR, D, and JK Flip-Flops. Clocked (Level and Edge Triggered) Flip-Flops. Preset\n" +
            "and Clear operations. Race-around conditions in JK Flip-Flop. M/S JK Flip-Flop.\n" +
            "Timers: IC 555: block diagram and applications: Astable multivibrator and Monostable multivibrator.",
    "Shift registers: Serial-in-Serial-out, Serial-in-Parallel-out, Parallel-in-Serial-out and Parallel-in Parallelout\n" +
            "Shift Registers (only up to 4 bits).\n" +
            "Counters(4 bits): Ring Counter. Asynchronous counters, Decade Counter. Synchronous Counter.\n" +
            "Computer Organization: Input/Output Devices. Data storage (idea of RAM and ROM). Computer\n" +
            "memory. Memory organization & addressing. Memory Interfacing. Memory Map.",
    "Intel 8085 Microprocessor Architecture: Main features of 8085. Block diagram. Components. Pin-out\n" +
            "diagram. Buses. Registers. ALU. Memory. Stack memory. Timing Control circuitry. Timing states.\n" +
            "Instruction cycle, Timing diagram of MOV and MVI.\n" +
            "Introduction to Assembly Language: 1 byte, 2 byte & 3 byte instructions.")
val refbooks32= arrayOf(
    "1. Digital Principles and Applications, A.P. Malvino, D .P.Leach and Saha, 7th Ed., 2011, Tata McGraw (T1)\n" +
            "2. Fundamentals of Digital Circuits, Anand Kumar, 2nd Edn, 2009, PHI Learning Pvt. Ltd.(T2)\n" +
            "3. Digital Circuits and systems, Venugopal, 2011, Tata McGraw Hill.(T3)\n" +
            "4. Digital Electronics G K Kharate ,2010, Oxford University Press(T4)",
    "1. Digital Systems: Principles & Applications, R.J.Tocci, N.S.Widmer, 2001, PHI Learning (R1)\n" +
            "2. Logic circuit design, Shimon P. Vingron, 2012, Springer.(R2)\n" +
            "3. Digital Electronics, Subrata Ghoshal, 2012, Cengage Learning.(R3)\n" +
            "4. Digital Electronics, S.K. Mandal, 2010, 1st edition, McGraw Hill (R4)\n" +
            "5. Microprocessor Architecture Programming & applications with 8085, 2002, R.S. Goankar, Prentice\n" +
            "Hall. (R5)")
val modules33= arrayOf("Review of Newtonian Mechanics; Application to the motion of a charge particle in external electric\n" +
        "and magnetic fields- motion in uniform electric field, magnetic field- gyroradius and\n" +
        "gyrofrequency, motion in crossed electric and magnetic fields.",
    "Generalized coordinates and velocities, Hamilton’s principle, Lagrangian and the Euler-Lagrange\n" +
            "equations, one-dimensional examples of the Euler-Lagrange equations- one-dimensional Simple\n" +
            "Harmonic Oscillations and falling body in uniform gravity; applications to simple systems such as\n" +
            "coupled oscillators Canonical momenta & Hamiltonian. Hamilton's equations of motion.\n" +
            "Applications: Hamiltonian for a harmonic oscillator, solution of Hamilton’s equation for Simple\n" +
            "Harmonic Oscillations; particle in a central force field- conservation of angular momentum and\n" +
            "energy.",
    "Minima of potential energy and points of stable equilibrium, expansion of the potential energy\n" +
            "around a minimum, small amplitude oscillations about the minimum, normal modes of oscillations\n" +
            "example of N identical masses connected in a linear fashion to (N -1) - identical springs.",
    "Postulates of Special Theory of Relativity. Lorentz Transformations. Minkowski space. The\n" +
            "invariant interval, light cone and world lines. Space-time diagrams. Time-dilation, length\n" +
            "contraction and twin paradox. Four-vectors: space-like, time-like and light-like. Four-velocity and\n" +
            "acceleration. Metric and alternating tensors. Four-momentum and energy-momentum relation.\n" +
            "Doppler effect from a four-vector perspective. Concept of four-force. Conservation of fourmomentum.\n" +
            "Relativistic kinematics. Application to two-body decay of an unstable particle",
    "Density \uF072\uF020and pressure P in a fluid, an element of fluid and its velocity, continuity equation and\n" +
            "mass conservation, stream-lined motion, laminar flow, Poiseuille’s equation for flow of a liquid\n" +
            "through a pipe, Navier-Stokes equation, qualitative description of turbulence, Reynolds number")
val refbooks33= arrayOf(
    "1. Classical Mechanics by H. Goldstein, Pearson Education Asia.\n" +
            "2. Classical Mechanics by N. C. Rana and P. S. Joag, Tata Mc-Graw Hill Publishing Company Limited, New\n" +
            "Delhi.",
    "1. Mechanics, L. D. Landau and E. M. Lifshitz, 1976, Pergamon.\n" +
            "2. Classical Electrodynamics, J.D. Jackson, 3rd Edn., 1998, Wiley.\n" +
            "3. The Classical Theory of Fields, L.D Landau, E.M Lifshitz, 4th Edn., 2003, Elsevier.\n" +
            "4. Introduction to Electrodynamics, D.J. Griffiths, 2012, Pearson Education.\n" +
            "5. Classical Mechanics, R. Douglas Gregory, 2015, Cambridge University Press.\n" +
            "6. Classical Mechanics: An introduction, Dieter Strauch, 2009, Springer.\n" +
            "7. Solved Problems in classical Mechanics, O.L. Delange and J. Pierrus, 2010, Oxford Press")
val modules34= arrayOf("Gaseous state: Kinetic theory of gas, Maxwell distribution equation, Ideal & real gases, compressibility\n" +
        "factor, Z. Van der Waals equation of state, Boyle temperature. Continuity of states, critical state, law of\n" +
        "corresponding states. Liquid state: Physical properties of liquids; vapour pressure, surface tension and\n" +
        "coefficient of viscosity. Solid state: Miller indices, symmetry elements and symmetry operations,\n" +
        "qualitative idea of point and space groups, seven crystal systems and fourteen Bravais lattices; X-ray\n" +
        "diffraction, Bragg’s law. Analysis of powder diffraction patterns ",
    "Strong, moderate and weak electrolytes, degree of ionization, ionization constant and ionic product of\n" +
            "water. Ionization of weak acids and bases, pH scale, common ion effect; dissociation constants of mono-,\n" +
            "di-and triprotic acids Salt hydrolysis-calculation of hydrolysis constant, degree of hydrolysis and pH for\n" +
            "different salts. Buffer solutions; derivation of Henderson equation and its applications. Solubility and\n" +
            "solubility product of sparingly soluble salt. Qualitative treatment of acid – base titration curves. Theory\n" +
            "of acid–bases; Arrhenius, Bronsted Lowry, Lewis concept, SHAB, solvent systems; selection of\n" +
            "indicators and their limitations. Hydrolysis and hydrolysis constants. ",
    "Aromaticity: Hückel’s rule, aromatic character of arenes, cyclic carbocations/carbanions and heterocyclic\n" +
            "compounds with suitable examples. Electrophilic aromatic substitution: Isotopic effect, halogenation,\n" +
            "nitration, sulphonation and Friedel-Craft’s alkylation/acylation with their mechanism & energy diagram,.\n" +
            "Directing effects of the groups. ",
    "Galvanic cells and electrolytic cells, Daniel cell, different kind of half-cells, electromotive forces of a cell\n" +
            "and its measurement, Nernst equation, Redox equilibrium, Standard Electrode Potential and its\n" +
            "application to inorganic reactions, different types of galvanic cells, Thermodynamics of electrochemical\n" +
            "cells and applications, Potentiometric titrations to determine various equilibrium constants. ",
    "Carbon-Carbon sigma bonds: Chemistry of alkanes, Wurtz Reaction, Wurtz-Fittig Reactions, Free radical\n" +
            "substitutions: Halogenation. Carbon-Carbon pi bonds: elimination reactions, Mechanism of E1, E2, E1cb\n" +
            "reactions. Saytzeff and Hofmann eliminations. Reactions of alkenes: Electrophilic additions their\n" +
            "mechanisms (Markownikoff/Anti Markownikoff addition), mechanism of oxymercurationdemercuration, hydroboration-oxidation, ozonolysis, reduction (catalytic and chemical), syn and antihydroxylation (oxidation). 1,2-and 1,4-addition reactions in conjugated dienes and, Diels-Alder reaction;\n" +
            "Allylic and benzylic bromination and mechanism, e.g. propene, 1-butene, toluene, ethyl benzene.\n" +
            "Reactions of alkynes: Acidity, Electrophilic and Nucleophilic additions. Hydration to form carbonyl\n" +
            "compounds, Alkylation of terminal alkynes. Alkanes & Cycloalkanes: Types, Conformational Analysis,\n" +
            "relative stability & Energy diagrams. ")
val refbooks34= arrayOf(
    "1. Kapoor, K. L. A Textbook of Physical Chemistry, Volume 1, Mcmillan Publishers India Ltd,\n" +
            "2004\n" +
            "2. Atkins, P. W. & Paula, J. de Atkin’s Physical Chemistry 10th Ed., Oxford University Press\n" +
            "(2014).\n" +
            "3. Castellan, G. W. Physical Chemistry 4th Ed. Narosa (2004).\n" +
            "4. Finar, I. L. Organic Chemistry (Volume 1), Dorling Kindersley (India) Pvt. Ltd. (Pearson\n" +
            "Education).\n" +
            "5. Morrison, R. N. & Boyd, R. N. Organic Chemistry, Dorling Kindersley (India) Pvt. Ltd. (Pearson\n" +
            "Education). \n",
    "1. Ball, D. W. Physical Chemistry Thomson Press, India (2007).\n" +
            "2. Mortimer, R. G. Physical Chemistry 3rd Ed. Elsevier: NOIDA, UP (2009).\n" +
            "3. Engel, T. & Reid, P. Physical Chemistry 3rd Ed. Pearson (2013).\n" +
            "4. McMurry, J.E. Fundamentals of Organic Chemistry, 7th Ed. Cengage Learning India Edition,\n" +
            "2013. \n")
class Physics_sem_3 : Fragment() {
    // TODO: Rename and change types of parameters



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_physics_sem_3, container, false)
        val button1 = view.findViewById<Button>(R.id.sem3_sub1)
        val button2 = view.findViewById<Button>(R.id.sem3_sub2)
        val button3 = view.findViewById<Button>(R.id.sem3_sub3)
        val button4 = view.findViewById<Button>(R.id.sem3_sub4)
        button1.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules31)
            intent.putExtra("books", refbooks31)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules32)
            intent.putExtra("books", refbooks32)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules33)
            intent.putExtra("books", refbooks33)
            startActivity(intent)
        }
        button1.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules31)
            intent.putExtra("books", refbooks31)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules34)
            intent.putExtra("books", refbooks34)
            startActivity(intent)
        }
        return view}

    companion object {

        fun newInstance(): Physics_sem_3=Physics_sem_3()
    }
}
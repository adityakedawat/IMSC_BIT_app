package com.example.imscbit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

val modulespe21= arrayOf("Scientific Programming: Some fundamental Linux Commands (Internal and External\n" +
        "commands). Development of FORTRAN, Basic elements of FORTRAN: Character Set,\n" +
        "Constants and their types, Variables and their types, Keywords, Variable Declaration and\n" +
        "concept of instruction and program. Operators: Arithmetic, Relational, Logical and\n" +
        "Assignment Operators. Expressions: Arithmetic, Relational, Logical, Character and\n" +
        "Assignment Expressions. Fortran Statements: I/O Statements (unformatted/formatted),\n" +
        "Executable and Non-Executable Statements, Layout of Fortran Program, Format of\n" +
        "writing Program and concept of coding, Initialization and Replacement Logic. Examples\n" +
        "from physics problems.",
    "Control Statements: Types of Logic (Sequential, Selection, Repetition),\n" +
            "BranchingStatements (Logical IF, Arithmetic IF, Block IF, Nested Block IF), Looping\n" +
            "Statements (DO-ENDDO, DO-WHILE), Subscripted Variables (Arrays: Types of\n" +
            "Arrays, DIMENSION Statement, Reading and Writing Arrays), Functions and\n" +
            "Subroutines (Arithmetic Statement Function, Function Subprogram and Subroutine),\n" +
            "RETURN and CALL Statements, Structure, Disk I/O Statements, open a file, writing in\n" +
            "a file, reading from a file. Examples from physics problems.",
    "Exercises on syntax on usage of Fortran, Usage of GUI Windows, Linux Commands,\n" +
            "familiarity with DOS commands and working in an editor to write codes in C.\nTo print out all natural even/ odd numbers between given limits.\n" +
            "To find maximum, minimum and range of a given set of numbers.\n" +
            "Calculating Euler number using exp(x) series evaluated at x=1 ",
    "Scientific word processing: Introduction to LaTeX: TeX/LaTeX word\n" +
            "processor,preparing a basic LaTeX file, Document classes, Preparing an input file for\n" +
            "LaTeX, Compiling LaTeX File, LaTeX tags for creating different environments,\n" +
            "Defining LaTeX commands and environments, Changing the type style, Symbols from\n" +
            "other languages. Equation representation: Formulae and equations, Figures and other\n" +
            "floating bodies, Lining in columns- Tabbing and tabular environment, Generating table\n" +
            "of contents, bibliography and citation, Making an index and glossary, List making\n" +
            "environments, Fonts, Picture environment and colors, errors.",
    "Visualization: Introduction to graphical analysis and its limitations. Introduction\n" +
            "toGnuplot. importance of visualization of computational and computational data, basic\n" +
            "Gnuplot commands: simple plots, plotting data from a file, saving and exporting,\n" +
            "multiple data sets per file, physics with Gnuplot (equations, building functions, user\n" +
            "defined variables and functions), Understanding data with Gnuplot")
val refbookspe21= arrayOf(
    "",
    "")
val modulespe22= arrayOf("Imperfections in solids and elastic deformation\n" +
        "Introduction to crystallography, types of imperfections, point defects, edge dislocation,\n" +
        "screw dislocation, mixed dislocation, Burger’s vector,dislocation density, surface defects,\n" +
        "grains, grain boundary,volume defects",
    "Elastic and Plastic deformation\n" +
            "Elastic deformation, Hooke’s law, atomic view of elasticity,anelasticity, elastic\n" +
            "moduli.plastic deformation, yield point phenomena, slip, slip systems, resolved shear\n" +
            "stress, plastic deformation of single crystals and polycrystalline materials, strain hardening,\n" +
            "annealing, recovery, recrystallization, grain growth, introduction to fracture, fatigue, creep.",
    "Ceramics\n" +
            "Ceramic structures, imperfections in ceramics, mechanical properties of ceramics, types and\n" +
            "applications of ceramics, advanced ceramics and their applications.",
    "Polymers and composites\n" +
            "Polymer structure, polymer crystallinity, mechanical behaviour of polymers, types of\n" +
            "polymers and their applications, advanced polymers and their application, general\n" +
            "properties, types, and applications of composites, fibre reinforced composites, various types\n" +
            "of fibres - plastic, glass, carbon, etc, influence of fibre length & orientation.",
    "Nanotechnology\n" +
            "Basic concepts of nanotechnology, nanomaterials (nanoparticles, nanoclusters, quantum\n" +
            "dots) nanoscale, effect of nano scale on material, properties: thermal, mechanical,\n" +
            "electrical, magnetic and optical properties. introduction to nanomaterials fabrication\n" +
            "techniques: top-down process (ball milling, lithography), bottom-up process (sputtering\n" +
            "techniques, chemical routes).")
val refbookspe22= arrayOf(
    "1. W. D. Callister, Materials Science and Engineering: An Introduction, John Wiley, 6th Edition, 2003.\n" +
            "2. W. F. Smith, Principles of Materials Science and Engineering, McGraw Hill International, 1986.\n" +
            "3. Introduction to Nanotechnology, Charles P. Poole, Jr., Frank J. Owens, John Wiley & Sons, 2013.",
    "1. The Structure and Properties of Materials, Wiley Eastern\n" +
            "Vol. –I, Moffatt, Pearsall and Wulff\n" +
            "Vol. –III, Hayden, Moffatt and Wulff\n" +
            "2. Physical Properties of Materials, M. C. Lovell, A. J. Avery, M. W. Vernon, ELBS")
val modulespe23= arrayOf("Measurements: Accuracy and precision. Significant figures. Error and uncertainty analysis.\n" +
        "Types of errors: Gross error, systematic error, random error. Statistical analysis of data\n" +
        "(Arithmetic mean, deviation from mean, average deviation, standard deviation, chi-square) and\n" +
        "curve fitting. Guassian distribution",
    "Signals and Systems: Periodic and aperiodic signals. Impulse response, transfer function and\n" +
            "frequency response of first and second order systems. Fluctuations and Noise in measurement\n" +
            "system. S/N ratio and Noise figure. Noise in frequency domain. Sources of Noise: Inherent\n" +
            "fluctuations, Thermal noise, Shot noise, 1/f noise\n" +
            "Shielding and Grounding: Methods of safety grounding. Energy coupling. Grounding.\n" +
            "Shielding: Electrostatic shielding. Electromagnetic Interference",
    "Transducers & industrial instrumentation (working principle, efficiency, applications): 14\n" +
            "Static and dynamic characteristics of measurement Systems. Generalized performance of\n" +
            "systems, Zero order first order, second order and higher order systems. Electrical, Thermal and\n" +
            "Mechanical systems. Calibration. Transducers and sensors. Characteristics of Transducers.\n" +
            "Transducers as electrical element and their signal conditioning. Temperature transducers: RTD,\n" +
            "Thermistor, Thermocouples, Semiconductor type temperature sensors (AD590, LM35, LM75)\n" +
            "and signal conditioning. Linear Position transducer: Strain gauge, Piezoelectric. Inductance\n" +
            "change transducer: Linear variable differential transformer (LVDT), Capacitance change\n" +
            "transducers. Radiation Sensors: Principle of Gas filled detector, ionization chamber, scintillation\n" +
            "detector",
    "Digital Multimeter: Comparison of analog and digital instruments. Block diagram of digital\n" +
            "multimeter, principle of measurement of I, V, C. Accuracy and resolution of measurement.\n" +
            "Impedance Bridges and Q-meter: Block diagram and working principles of RLC bridge.\n" +
            "Q-meter and its working operation. Digital LCR bridge.",
    "Vacuum Systems: Characteristics of vacuum: Gas law, Mean free path. Application of vacuum.\n" +
            "Vacuum system- Chamber, Mechanical pumps, Diffusion pump & Turbo Modular pump,\n" +
            "Pumping speed, Pressure gauges (Pirani, Penning, ionization).")
val refbookspe23= arrayOf(
    "T1: Thomas L. Floyd. ELECTRONIC. DEVICES. 9th Edition. Prentice Hall.\n" +
            "T2: Louis Nashelsky and Robert Boylestad, Electronic Devices and Circuit Theory",
    "")
class Physics_PE_II : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physics__p_e__i_i)
        val button1 = findViewById<Button>(R.id.pe2_sub1)
        val button2 = findViewById<Button>(R.id.pe2_sub2)
        val button3 = findViewById<Button>(R.id.pe2_sub3)
        button1.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe21)
            intent.putExtra("books", refbookspe21)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe22)
            intent.putExtra("books", refbookspe22)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe23)
            intent.putExtra("books", refbookspe23)
            startActivity(intent)
        }
    }
}
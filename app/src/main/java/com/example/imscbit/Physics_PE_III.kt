package com.example.imscbit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
val modulespe31= arrayOf("Energy Sources:World energy status, current energy scenario in India, environmental aspects of\n" +
        "energy utilization, Classification of energy, Energy Resources, need of renewable energy, nonconventional\n" +
        "energy sources. An overview of developments in Offshore Wind Energy, Tidal\n" +
        "Energy, Wave energy systems, Ocean energy, Thermal Energy Conversion, solar energy, biomass,\n" +
        "biochemical conversion, biogas generation, geothermal energy tidal energy, Hydroelectricity.\n" +
        "Energy conservation and storage.",
    "Solar energy, its importance, storage of solar energy, solar pond, non-convective solar pond,\n" +
            "applications of solar pond and solar energy, solar water heater,flat plate collector, solar distillation,\n" +
            "solar cooker, solar green houses, solar cell,absorption air conditioning. Need and characteristics of\n" +
            "photovoltaic (PV) systems, PV models and equivalent circuits, and sun tracking systems.",
    "Wind Energy: Fundamentals of Wind energy, Wind Turbines and different electrical machines in\n" +
            "wind turbines, Power electronic interfaces, and grid interconnection topologies. Ocean Energy,\n" +
            "Potential against Wind and Solar, Wave Characteristics, Wave Energy Devices. Tide\n" +
            "characteristics and Statistics, Tide Energy Technologies, Ocean Thermal Energy, Osmotic Power,\n" +
            "Ocean Bio-mass.",
    "Biomass energy, resources, conversion, gasification, liquefaction, production, energy farming,\n" +
            "Geothermal Energy: Geothermal Resources, Geothermal Technologies. small hydro resources.\n" +
            "Layout, water turbines, classifications, generators, status.",
    "Direct Energy conversion: Thermoelectric effects, generators, Thermionic generators, magneto\n" +
            "hydro dynamics generators, Fuel cells, photovoltaic generators, electrostatic mechanical\n" +
            "generators, Thin film solar cells, nuclear batteries.")
val refbookspe31= arrayOf(
    "1. Solar cells: Operating principles, technology and system applications by Martin A Green, Prentice Hall Inc, Englewood\n" +
            "Cliffs, NJ, USA, 1981.",
    "1. Non conventional Energy Resources, B. H. Khan, Tata McGraw Hill, 2010\n" +
            "2. Non conventional energy Sources and Utilization, R. K. Rajput, S Chand Publ., 2014")
val modulespe32= arrayOf("General Properties of Nuclei: Constituents of nucleus and their Intrinsic properties, quantitative facts\n" +
        "about mass, radii, charge density (matter density), binding energy, average binding energy and its\n" +
        "variation with mass number, main features of binding energy versus mass number curve, N/A plot,\n" +
        "angular momentum, parity, magnetic moment, electric moments, nuclear excites states.\n" +
        "Nuclear Models: Liquid drop model approach, semi empirical mass formula and significance of its\n" +
        "various terms, condition of nuclear stability, two nucleon separation energies, Fermi gas model\n" +
        "(degenerate fermion gas, nuclear symmetry potential in Fermi gas), evidence for nuclear shell\n" +
        "structure, nuclear magic numbers, basic assumption of shell model, concept of mean field, residual\n" +
        "interaction, concept of nuclear force.",
    "Radioactivity decay:(a) Alpha decay: basics of α-decay processes, theory of α- emission, Gamow\n" +
            "factor, Geiger Nuttall law, α-decay spectroscopy. (b) α-decay: energy kinematics for α-decay,\n" +
            "positron emission, electron capture, neutrino hypothesis. (c) Gamma decay: Gamma rays emission &\n" +
            "kinematics, internal conversion.\n" +
            "Nuclear Reactions: Types of Reactions, Conservation Laws, kinematics of reactions, Q-value,\n" +
            "reaction rate, reaction cross section, Concept of compound and direct Reaction, resonance reaction,\n" +
            "Coulomb scattering (Rutherford scattering).",
    "Interaction of Nuclear Radiation with matter: Energy loss due to ionization (Bethe-Block formula),\n" +
            "energy loss of electrons, Cerenkov radiation. Gamma ray interaction through matter, photoelectric\n" +
            "effect, Compton scattering, pair production, neutron interaction with matter.\n" +
            "Detector for Nuclear Radiations: Gas detectors: estimation of electric field, mobility of particle, for\n" +
            "ionization chamber and GM Counter. Basic principle of Scintillation Detectors and construction of\n" +
            "photo-multiplier tube (PMT). Semiconductor Detectors (Si and Ge) for charge particle and photon\n" +
            "detection (concept of charge carrier and mobility), neutron detector.",
    "Particle Accelerators: Accelerator facility available in India: Van-de Graaff generator (Tandem accelerator), Linear accelerator, Cyclotron, Synchrotrons.",
    "Particle physics: Particle interactions; basic features, types of particles and its families. Symmetries\n" +
            "and Conservation Laws: energy and momentum, angular momentum, parity, baryon number, Lepton\n" +
            "number, Isospin, Strangeness and charm, concept of quark model, color quantum number and gluons.")
val refbookspe32= arrayOf(
    "1. Introductory nuclear Physics by Kenneth S. Krane (Wiley India Pvt. Ltd., 2008).\n" +
            "2. Concepts of nuclear physics by Bernard L. Cohen. (Tata Mcgraw Hill, 1998).\n" +
            "3. Introduction to High Energy Physics, D.H. Perkins, Cambridge Univ. Press\n" +
            "4. Introduction to Elementary Particles, D. Griffith, John Wiley & Sons",
    "1.Quarks and Leptons, F. Halzen and A.D. Martin, Wiley India, New Delhi\n" +
            "2. Radiation detection and measurement, G.F. Knoll (John Wiley & Sons, 2000).")
val modulespe33= arrayOf("Radiation interaction fundamentals, Alpha particle, Beta particle, Gamma ray, Table of nuclides\n" +
        "Half-life., Radioactive decay.\n" +
        "Radioactive waste, Classification of Radioactive Wastes, High-level Waste (HLW), Intermediatelevel\n" +
        "Waste (ILW), Low-level Waste (LLW).\n" +
        "Who is Responsible for Radioactive Wastes, Pertinent Legislation in the US Regarding Radioactive\n" +
        "Hazards and Wastes: Examples.",
    "Splitting the Atom for Energy, Status of Nuclear Power World-wide, Commercial Nuclear Power\n" +
            "Generation, Nature of HLW as a Function of Time, Fast Reactors, The Nuclear Fuel Cycle, Options\n" +
            "in the Fuel Cycle that Impact Waste Management, Once-Through Fuel Option, The Reprocessing\n" +
            "Fuel Cycle (RFC), Advanced Fuel Cycle (AFC), Important Characteristics of Actinides.",
    "Separations Technologies for the Nuclear Fuel Cycle, PUREX Process, DIAMEX Process, TRUEX\n" +
            "Process, TRAMEX Process, TALSPEAK Process, Stereospecific Extractants, Non-aqueous\n" +
            "Processes, Volatility Processes, Molten Salt Processes, Electrochemical Separations using Non-\n" +
            "Aqueous Processes, Advanced Fuel Cycle Concepts and Partitioning and Transmutation (P&T).",
    "Transmutation of Minor Actinides, Transmutation of the Long-lived Fission Products, Partitioning\n" +
            "Schemes for the Minor Actinides and Long-lived Fission Products, Aqueous Chemical Processing,\n" +
            "Improved PUREX Process - Removal of Np, I, and Tc, UREX and UREX+ Processes, Non-\n" +
            "Aqueous Chemical Processing, Transmutation Devices for the Advanced Fuel Cycle.",
    "Strategies for Implementation of an Advanced Fuel Cycle, Generation IV Nuclear Energy Systems,\n" +
            "Advanced Fuel Cycle Development to Support Generation IV Energy Systems, The Advanced Fuel\n" +
            "Cycle Initiative (AFCI), Areas of Scientific Concerns in the AFCI, Future of P&T\n" +
            "Radioactive Waste Regulations, Nuclear Waste Policy Act")
val refbookspe33= arrayOf(
    "T1: Natural and Human Induced Hazards and Environmental Waste Management Volume 2 e-ISBN: 978-1-84826-300-0\n" +
            "ISBN : 978-1-84826-750-3 No. of Pages: 370",
    "R1: Management of Radioactive Waste after a Nuclear Power Plant Accident\n" +
            "© OECD 2016 NEA No. 7305 NUCLEAR ENERGY AGENCY ORGANISATION FOR ECONOMIC COOPERATION\n" +
            "AND DEVELOPMENT.")
class Physics_PE_III : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physics__p_e__i_i_i)
        val button1 = findViewById<Button>(R.id.pe3_sub1)
        val button2 = findViewById<Button>(R.id.pe3_sub2)
        val button3 = findViewById<Button>(R.id.pe3_sub3)
        button1.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe31)
            intent.putExtra("books", refbookspe31)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe32)
            intent.putExtra("books", refbookspe32)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe33)
            intent.putExtra("books", refbookspe33)
            startActivity(intent)
        }
    }
}
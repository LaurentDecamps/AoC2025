# Day 00 – Warming up

Before we jump into the calendar, we start with a **setup day**.

We are not redoing the exercise here, we are getting used to the framework. We will be playing memories and taking different looks at them during the month.

The idea here is to configure your **IDE**, your **AI assistant**, and your **workflow** so that the rest of the adventure feels smooth.

We’ll use a first memory as our playground:

> **Memory fragment – 2023 · Day 1**  
> I have seen that code a long time ago...  
> I once took it and made it easier to understand  
> by slicing that big method into smaller private ones, each telling a tiny  
> part of the story.  
> I don’t quite remember the rules, but that feeling:  
> *“Ahhh, so this is what it’s like when code starts to read like prose.”*

---

## Where to play

Pick the stack you want to use as your **main stack** this year and open the Day 1 memory from 2023, e.g.:

- `memories/2023/exercises/<your-stack>/day01`

This is just your **sandbox** for today.

---

## Challenge — Configure your tools

Make sure you can run tests, your IDE is well configured, and you have all the plugins you need (could be SonarLint, an AI assistant, etc.).

---

## Tutorial

### Example of how to validate the challenge and activate the memory

⚠️WARNING⚠️ The following section is here to help you get started.  
It will **not** be provided for the following days — everything else will happen on Discord.

#### 1. Run the tests correctly

- Open the project in your IDE.
- Make sure you can run the tests **with a single command or shortcut**:
  - e.g. a Gradle/Maven task, a test run configuration, `npm test`, `pytest`, etc.
- Run them once and note:
  - Do they pass?
  - How long do they take?
  - Is there anything you need to fix or configure (SDK, JDK, dependencies)?

> *Goal:* by the end of today, “run all tests” should feel trivial.

---

#### 2. Shape your IDE

Set up your editor so you can **see tests and implementation together**:

- Split your screen/panels so that (example):
  - on the **left**: the test file(s) for this piece of code,
  - on the **right**: the production code (the big method / object you’ll refactor).
- Create any run configuration you’ll want to reuse during the month (test runner, debugger, etc.).

> *Goal:* train your eyes to flick between tests and code with almost no effort.

---

#### 3. Use refactoring tools accordingly

Now use the **IDE’s refactoring tools** (not manual copy-paste) to simplify the big method:

- Identify one long or complex method (often something like `run`, `execute`, `process`…).
- Use **“Extract Method”** / **“Extract Function”** to:
  - pull out small private methods,
  - give them names that describe the domain behaviour (not the technical detail), e.g.:
    - `loadConfiguration()`
    - `validateRequest()`
    - `assignGiftsToElves()`
- Run the tests after each couple of extracts (or at least regularly) to confirm behaviour stays the same.

You don’t need a perfect design.  
You just want to feel how **fast, safe refactorings** are with your tools properly set up.

---

#### 4. Reflect with your AI assistant

Pick the AI assistant you want to use during this Advent.

Use it **once** on this Day 0 exercise, for reflection only:

- Show it the refactored method and the extracted private methods.
- Ask things like:
  - “From the names alone, what do you think this class does?”
  - “Suggest alternative names for these methods.”

Then **you** decide:

- Which suggestions do you accept?
- Which do you reject?
- What does that tell you about your own taste and biases?

Post your solution in the `community/solutions/day00/` folder copying the template located here `community/solutions/TEMPLATE-[replace_with_your_name].md`

Use the `journey/your-name.md` file, write a short Day 0 entry:

- How hard was it to get tests running?
- What refactoring shortcuts did you discover or rediscover?
- One thing your AI assistant said that you agreed/disagreed with.

---

The memory is activated when:

- your tests run easily,
- your IDE layout feels helpful,
- you've read and understood the IDE suggestions,
- you’ve successfully extracted a few methods with the refactoring tools,
- and you’ve had at least one **small conversation with your AI** about the code.

Tomorrow, we are diving into the real timeloop. Today is just about making sure you have a comfortable cockpit for the tasks ahead. ✨

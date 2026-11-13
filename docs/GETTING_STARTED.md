# Getting Started

## 1. Prerequisites

Java 21, Git, Docker Engine/Desktop with Compose v2, Python 3.10+ for the gate. Maven 3.9.9 is downloaded by the included official Maven wrapper. An IDE is optional.

## 2. Clone and read

```bash
git clone https://github.com/Abd-Elrahman3/01-shelfflow-spring-boot.git
cd 01-shelfflow-spring-boot
git switch -c feature/m1-domain
```

Read README sections 1–5, then SHARED_MILESTONES.md. Use one branch per milestone and one small testable rule per commit.

## 3. First build and learning tests

```bash
./mvnw clean verify
./mvnw -Plearning -Dmilestone.groups=structure,M1 test
```

Windows: use `mvnw.cmd` in PowerShell/cmd. The first command should be green: it only tests packaging. The second is intentionally red until you implement M1. There are no hidden solutions. Search `TODO:` or use the IDE TODO window. Later milestone test files start with `fail("TODO: ...")`; replace each with real setup/action/assertions instead of disabling/deleting it.

After implementing a milestone and filling its evidence file:

```bash
python3 scripts/check_progress.py --through M1
```

The gate runs all tests tagged structure plus milestones through the requested one. At D7 it checks all seven and scans production source for unfinished TODO markers. It also rejects skipped/empty milestone suites. It cannot judge whether a handwritten test is meaningful; peer review and the failure drills remain required.

## 4. Local dependencies and application

```bash
cp .env.example .env
docker compose up -d --wait
```

Compose reads `.env` automatically; Maven does not. The supplied application config defaults match the local Compose database, so no shell sourcing is needed for the database. Export custom values in your shell/IDE when changing them. Never commit `.env` or use its development password outside your laptop. All published infrastructure ports bind to 127.0.0.1. Run one project’s stack at a time or change the host ports and matching variables.

The migration V1 is a **comment-only placeholder**. Before first database startup, replace it with the required schema; once a migration has been applied, add a new version rather than editing its checksum. Keep `ddl-auto=validate`. Do not use `create`, `update` or H2 to hide missing migrations.

After M2 and the relevant API/config milestones:

```bash
./mvnw spring-boot:run
```

The application uses port 8080 and loopback by default. `/learning/status` deliberately returns 501. Business routes are typed skeletons that throw TODO errors until D4. Booting successfully does not mean requirements are implemented. For container deployment later, explicitly set SERVER_ADDRESS=0.0.0.0 and configure authentication/network exposure.

## Troubleshooting

- Dependency resolution: check JDK version, proxy/CA settings and access to Maven Central; never disable TLS verification.
- Database connection: inspect `docker compose ps`, port mapping and application variables. Use `docker compose logs postgres` for the specific error.
- Red learning tests: read the rule ID in the failure and implement the next missing behavior.
- Docker unavailable in CI: use a Docker-capable runner; do not replace database concurrency tests with mocks.
- Data reset: `docker compose down` preserves named volumes. `down -v` destroys local data; use it only when intentionally resetting your own development fixtures.

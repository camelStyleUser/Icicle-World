package ice.content;

import arc.graphics.*;
import arc.math.Interp;
import arc.math.Mathf;
import arc.math.geom.Rect;
import ice.classes.entities.abilities.RepairPillAbility;
import ice.classes.entities.types.*;
import ice.graphics.IcePal;
import mindustry.ai.UnitCommand;
import mindustry.ai.types.*;
import mindustry.content.Fx;
import mindustry.entities.bullet.*;
import mindustry.entities.part.*;
import mindustry.gen.*;
import mindustry.graphics.Layer;
import mindustry.graphics.Pal;
import mindustry.type.*;
import mindustry.type.unit.MissileUnitType;
import mindustry.type.unit.TankUnitType;
import mindustry.type.weapons.*;

import static ice.content.IceBullets.*;
public class IceUnitTypes {
    public static UnitType
    //core
    malice, charity,
    //construct W.I.P/ //I NOT GONNA DO THAT
    vessel, stem, basis, ewer, xylem, fundament,
    //wave (presets of construct units)
    vesselPoint,
        //executioners (Mini bosses)
        yellow, purple, red, blue, green,
    //funny
    basic, octo, swarmling, reaver, giant;
    public static void load(){
        malice = new RkiUnitType("malice"){{
            aiController = BuilderAI::new;
            defaultCommand = UnitCommand.rebuildCommand;
            isEnemy = false;

            lowAltitude = true;
            mineSpeed = 5f;
            mineTier = 2;
            buildSpeed = 1f;
            drag = 0.06f;
            speed = 2.5f;
            rotateSpeed = 15f;
            accel = 0.11f;
            fogRadius = 5f;
            itemCapacity = 40;
            health = 330f;
            hitSize = 14f;
            constructor = LegsUnit::create;
            mineWalls = true;
            legLength = 12f;
            hovering = true;
            lockLegBase = true;
            legContinuousMove = true;
            legExtension = -3f;
            legBaseOffset = 4f;
            legMaxLength = 1f;
            legMinLength = 0.2f;
            legLengthScl = 0.95f;
            legForwardScl = 0.55f;

            legMoveSpace = 1f;
            groundLayer = Layer.legUnit - 1f;

            weapons.add(new Weapon("icicle-world-malice-gun"){{
                top = false;
                reload = 24f;
                rotate = false;
                shootCone = 20;
                mirror = false;
                x = 0f;
                y = 3f;

                inaccuracy = 5f;
                ejectEffect = IceFx.pointEject;

                bullet = pointCoreBullet;
            }},
                    new RepairBeamWeapon("icicle-world-malice-repair-gun"){{
                        widthSinMag = 0.065f;
                        reload = 20f;
                        x = 0f;
                        y = -2f;
                        rotate = true;
                        shootY = 2f;
                        beamWidth = 0.5f;
                        repairSpeed = 2f;
                        fractionRepairSpeed = 1.1f;
                        aimDst = 0f;
                        shootCone = 20f;
                        mirror = false;
                        top = true;

                        targetUnits = false;
                        targetBuildings = true;
                        autoTarget = true;
                        aiControllable = true;
                        controllable = false;
                        laserColor = IcePal.thalliumMid;
                        healColor = IcePal.thalliumMid;

                        bullet = new BulletType(){{
                            maxRange = 35f;
                        }};
                    }});
        }};
        charity = new RkiUnitType("charity"){{
            aiController = BuilderAI::new;
            defaultCommand = UnitCommand.rebuildCommand;
            isEnemy = false;

            lowAltitude = true;
            mineSpeed = 7.5f;
            mineTier = 3;
            buildSpeed = 1.6f;
            drag = 0.08f;
            speed = 2.8f;
            rotateSpeed = 17f;
            accel = 0.13f;
            fogRadius = 5f;
            itemCapacity = 40;
            health = 520f;
            armor = 3;
            hitSize = 14f;
            constructor = LegsUnit::create;
            mineWalls = true;
            hovering = true;
            lockLegBase = true;
            legContinuousMove = true;
            legCount = 6;
            legExtension = -6.5f;
            legBaseOffset = 5f;
            legMaxLength = 0.9f;
            legLength = 19f;
            legMinLength = 0.38f;
            legLengthScl = 1f;
            legForwardScl = 0.6f;

            legMoveSpace = 1f;
            groundLayer = Layer.legUnit - 1f;

            weapons.add(new Weapon("icicle-world-malice-gun"){{
                            top = false;
                            reload = 13.5f;
                            rotate = false;
                            shootCone = 20;
                            mirror = true;
                            alternate = false;
                            x = 3f;
                            y = 5f;

                            inaccuracy = 5f;
                            ejectEffect = IceFx.pointEject;

                            bullet = pointCoreBullet;
                        }},
                    new RepairBeamWeapon("icicle-world-malice-repair-gun"){{
                        widthSinMag = 0.07f;
                        reload = 20f;
                        x = 4.5f;
                        y = -3f;
                        rotate = true;
                        shootY = 2f;
                        beamWidth = 0.535f;
                        repairSpeed = 1.4f;
                        fractionRepairSpeed = 0.75f;
                        aimDst = 0f;
                        shootCone = 25f;
                        mirror = true;
                        top = true;

                        targetUnits = false;
                        targetBuildings = true;
                        autoTarget = true;
                        aiControllable = true;
                        controllable = false;
                        laserColor = IcePal.thalliumMid;
                        healColor = IcePal.thalliumMid;

                        bullet = new BulletType(){{
                            maxRange = 46.5f;
                        }};
                    }});
        }};
        vessel = new RkiUnitType("vessel"){{
            drag = 0.08f;
            speed = 1.45f;
            rotateSpeed = 12f;
            accel = 0.13f;
            fogRadius = 9f;
            itemCapacity = 10;
            health = 290f;
            hitSize = 12f;
            constructor = LegsUnit::create;
            legLength = 10f;
            legMaxLength = 1.2f;
            legMinLength = 0.2f;
            legLengthScl = 0.8f;
            legForwardScl = 0.65f;
            hovering = true;

            legMoveSpace = 1f;
            groundLayer = Layer.legUnit - 1f;
            weapons.add(new Weapon("icicle-world-vessel-weapon"){{
                top = true;
                reload = 42f;
                rotate = false;
                shootCone = 32;
                mirror = false;
                x = 0f;
                y = -1f;

                inaccuracy = 14f;
                ejectEffect = Fx.casing2;

                bullet = vesselBullet;
            }});
        }};
        stem = new RkiUnitType("stem"){{
            speed = 1.05f;
            rotateSpeed = 12f;
            armor = 3;
            itemCapacity = 15;
            health = 410f;
            hitSize = 10f;
            constructor = MechUnit::create;
            weapons.add(new Weapon("icicle-world-stem-weapon"){{
                top = false;
                reload = 4f;
                rotate = false;
                shootCone = 40;
                mirror = true;
                shootSound = Sounds.pew;
                x = 6f;
                y = 0f;

                inaccuracy = 20f;
                ejectEffect = Fx.casing2;

                bullet = stemBullet;
            }});
        }};
        basis = new RkiTankUnitType("basis"){{
            hitSize = 12f;
            treadPullOffset = -3;
            speed = 0.75f;
            rotateSpeed = 3.5f;
            health = 600;
            armor = 8f;
            itemCapacity = 0;
            researchCostMultiplier = 0f;
            constructor = TankUnit::create;
            treadRects = new Rect[]{new Rect(11 - 32f, 8 - 32f, 9, 53)};

            weapons.add(new Weapon("icicle-world-basis-weapon"){{
                layerOffset = 0.0001f;
                reload = 60f;
                shootY = 4.5f;
                recoil = 2.4f;
                rotate = true;
                rotateSpeed = 2.4f;
                mirror = true;
                x = 3f;
                y = -1f;
                heatColor = IcePal.thalliumLightish;
                cooldownTime = 32f;

                bullet = basisBullet;
            }});
        }};
        ewer = new RkiUnitType("ewer"){{
            drag = 0.1f;
            speed = 1;
            rotateSpeed = 9f;
            accel = 0.11f;
            fogRadius = 11f;
            itemCapacity = 25;
            health = 1960f;
            hitSize = 17f;
            constructor = LegsUnit::create;
            legLength = 17f;
            legMaxLength = 1.5f;
            legMinLength = 0.6f;
            legLengthScl = 1f;
            legForwardScl = 0.7f;
            hovering = true;

            legMoveSpace = 1f;
            groundLayer = Layer.legUnit - 1f;
            weapons.add(new Weapon("icicle-world-ewer-weapon"){{
                top = true;
                reload = 30f;
                rotate = false;
                shootCone = 40;
                mirror = false;
                x = 0f;
                y = -2f;

                inaccuracy = 8f;
                ejectEffect = Fx.casing2;

                bullet = ewerBullet;
            }});
        }};
        xylem = new RkiUnitType("xylem"){{
            speed = 0.65f;
            rotateSpeed = 7f;
            armor = 7;
            itemCapacity = 15;
            health = 3720f;
            hitSize = 29f;
            constructor = MechUnit::create;
            weapons.add(new Weapon("icicle-world-xylem-weapon"){{
                top = false;
                reload = 8f;
                rotate = false;
                shootCone = 45;
                mirror = true;
                shootSound = Sounds.flame2;
                x = 15.75f;
                y = 0f;
                shootY = 4f;

                ejectEffect = Fx.none;

                bullet = xylemFlame;
            }});
        }};
        fundament = new RkiTankUnitType("fundament"){{
            hitSize = 21f;
            treadPullOffset = 0;
            speed = 0.49f;
            rotateSpeed = 1.95f;
            health = 4560;
            armor = 14f;
            itemCapacity = 0;
            researchCostMultiplier = 0f;
            constructor = TankUnit::create;
            treadRects = new Rect[]{new Rect(17 - 76f, 19 - 76f, 14, 114)};

            weapons.add(new Weapon("icicle-world-fundament-weapon"){{
                layerOffset = 0.0001f;
                reload = 90f;
                shootY = 4.5f;
                recoil = 0f;
                rotate = false;
                rotateSpeed = 0f;
                shootCone = 360;
                inaccuracy = 360;
                mirror = false;
                x = 0f;
                y = 0f;
                shoot.shots = 4;

                heatColor = IcePal.thalliumLightish;
                cooldownTime = 40f;

                bullet = fundamentLightningBall;
            }});
        }};
        vesselPoint = new RkiUnitType("vessel-point"){{
            hidden = true;
            drag = 0.08f;
            speed = 1.45f;
            rotateSpeed = 12f;
            accel = 0.13f;
            fogRadius = 9f;
            itemCapacity = 10;
            health = 290f;
            hitSize = 12f;
            constructor = LegsUnit::create;
            legLength = 10f;
            legMaxLength = 1.2f;
            legMinLength = 0.2f;
            legLengthScl = 0.8f;
            legForwardScl = 0.65f;
            hovering = true;

            legMoveSpace = 1f;
            groundLayer = Layer.legUnit - 1f;
            weapons.add(new Weapon("icicle-world-malice-repair-gun"){{
                top = false;
                reload = 35f;
                rotate = false;
                shootCone = 20;
                mirror = false;
                x = 0f;
                y = 2f;

                inaccuracy = 8f;
                ejectEffect = IceFx.pointEject;

                bullet = pointBullet;
            }});
        }};
        yellow = new RkiUnitType("yellow"){{
            drag = 0.08f;
            speed = 0.9f;
            rotateSpeed = 7f;
            accel = 0.18f;
            fogRadius = 15f;
            itemCapacity = 30;
            health = 18500f;
            hitSize = 25f;
            constructor = LegsUnit::create;
            legLength = 16f;
            legMaxLength = 2f;
            legMinLength = 1.15f;
            legLengthScl = 1.1f;
            legForwardScl = 0.85f;
            stepShake = 0.6f;
            legCount = 6;
            hovering = true;

            legMoveSpace = 1f;
            groundLayer = Layer.legUnit - 1f;
            abilities.add(new RepairPillAbility(30f,45f){{
                y = -9;
            }});
            weapons.add(new Weapon("icicle-world-yellow-side-cannon"){{
                top = false;
                reload = 65f;
                rotate = false;
                shootCone = 35;
                mirror = true;
                recoil = 1.5f;
                layerOffset = -0.00001f;
                x = 4.5f;
                y = 6f;

                inaccuracy = 8f;
                ejectEffect = IceFx.pointEject;

                bullet = yellowBlast;
            }},
                    new Weapon("icicle-world-yellow-back-cannon"){{
                        top = true;
                        reload = 110f;
                        rotate = false;
                        shootCone = 50;
                        mirror = true;
                        recoil = 1.5f;
                        layerOffset = 0.00001f;
                        x = 4f;
                        y = -3.5f;
                        shoot.shots = 3;
                        shoot.shotDelay = 6;

                        inaccuracy = 12f;
                        ejectEffect = IceFx.pointEject;

                        bullet = yellowPlasma;
                    }});
        }};
        basic = new UnitType("basic"){{
            health = 1000;
            speed = 7f;
            hitSize = 11f;
            drag = 1f;
            flying = true;
            drawBody = false;
            range = 60f;
            constructor = UnitEntity::create;
            engineSize = 0;
            parts.add(new ShapePart(){{
                          progress = PartProgress.life;
                          color = Color.valueOf("1d54a1");
                          hollow = false;
                          circle = true;
                          radius = 6f;
                      }},
                    new ShapePart(){{
                        progress = PartProgress.life;
                        color = Color.valueOf("3873c5");
                        hollow = false;
                        radius = 4.8f;
                        circle = true;
                    }});
            weapons.add(
                    new Weapon("barrel"){{
                        shootSound = Sounds.blaster;
                        reload = 20f;
                        x = 0f;
                        y = 5f;
                        shootY = 3;
                        mirror = false;
                        top = false;
                        rotate = false;
                        bullet = basicBullet;
                        parts.add(new ShapePart(){{
                                      progress = PartProgress.life;
                                      color = Color.valueOf("5b5b5bff");
                                      hollow = false;
                                      sides = 4;
                                      rotation = 45;
                                      radius = 4f;
                                  }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("5b5b5bff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 4f;
                                    y = 2;
                                }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("7e7e7eff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 2.8f;
                                }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("7e7e7eff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 2.8f;
                                    y = 2;
                                }});
                    }});
        }};
        octo = new UnitType("octo"){{
            health = 1000;
            speed = 7f;
            hitSize = 11f;
            drag = 1f;
            flying = true;
            drawBody = false;
            range = 60f;
            constructor = UnitEntity::create;
            engineSize = 0;
            parts.add(new ShapePart(){{
                          progress = PartProgress.life;
                          color = Color.valueOf("1d54a1");
                          hollow = false;
                          circle = true;
                          radius = 6f;
                      }},
                    new ShapePart(){{
                        progress = PartProgress.life;
                        color = Color.valueOf("3873c5");
                        hollow = false;
                        radius = 4.8f;
                        circle = true;
                    }});
            weapons.add(
                    new Weapon("barrel"){{
                        shootSound = Sounds.blaster;
                        reload = 20f;
                        x = 0f;
                        y = 5f;
                        shootCone = 360;
                        shootY = 3;
                        mirror = false;
                        top = false;
                        rotate = false;
                        bullet = basicBullet;
                        parts.add(new ShapePart(){{
                                      progress = PartProgress.life;
                                      color = Color.valueOf("5b5b5bff");
                                      hollow = false;
                                      sides = 4;
                                      rotation = 45;
                                      radius = 4f;
                                  }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("5b5b5bff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 4f;
                                    y = 2;
                                }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("7e7e7eff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 2.8f;
                                }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("7e7e7eff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 2.8f;
                                    y = 2;
                                }});
                    }},
                    new Weapon("barrel"){{
                        shootSound = Sounds.blaster;
                        reload = 20f;
                        x = 0f;
                        y = -5f;
                        baseRotation = 180;
                        shootCone = 360;
                        shootY = 3;
                        mirror = false;
                        top = false;
                        rotate = false;
                        bullet = basicBullet;
                        parts.add(new ShapePart(){{
                                      progress = PartProgress.life;
                                      color = Color.valueOf("5b5b5bff");
                                      hollow = false;
                                      sides = 4;
                                      rotation = 45;
                                      radius = 4f;
                                  }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("5b5b5bff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 4f;
                                    y = 2;
                                }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("7e7e7eff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 2.8f;
                                }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("7e7e7eff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 2.8f;
                                    y = 2;
                                }});
                    }},
                    new Weapon("barrel"){{
                        shootSound = Sounds.blaster;
                        reload = 20f;
                        x = 5f;
                        y = 0f;
                        shootY = 3;
                        shootCone = 360;
                        baseRotation = -90;
                        mirror = false;
                        top = false;
                        rotate = false;
                        bullet = basicBullet;
                        parts.add(new ShapePart(){{
                                      progress = PartProgress.life;
                                      color = Color.valueOf("5b5b5bff");
                                      hollow = false;
                                      sides = 4;
                                      rotation = 45;
                                      radius = 4f;
                                  }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("5b5b5bff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 4f;
                                    y = 2;
                                }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("7e7e7eff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 2.8f;
                                }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("7e7e7eff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 2.8f;
                                    y = 2;
                                }});
                    }},
                    new Weapon("barrel"){{
                        shootSound = Sounds.blaster;
                        reload = 20f;
                        x = -5f;
                        y = 0f;
                        shootY = 3;
                        shootCone = 360;
                        baseRotation = 90;
                        mirror = false;
                        top = false;
                        rotate = false;
                        bullet = basicBullet;
                        parts.add(new ShapePart(){{
                                      progress = PartProgress.life;
                                      color = Color.valueOf("5b5b5bff");
                                      hollow = false;
                                      sides = 4;
                                      rotation = 45;
                                      radius = 4f;
                                  }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("5b5b5bff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 4f;
                                    y = 2;
                                }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("7e7e7eff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 2.8f;
                                }},
                                new ShapePart(){{
                                    progress = PartProgress.life;
                                    color = Color.valueOf("7e7e7eff");
                                    hollow = false;
                                    sides = 4;
                                    rotation = 45;
                                    radius = 2.8f;
                                    y = 2;
                                }});
                    }});
        }};
        giant = new MonsterUnitType("giant"){{
            speed = 0.38f;
            hitSize = 16f;
            health = 1480;
            armor = 2;
            bloodAmount = 60f;
            constructor = MechUnit::create;
            weapons.add(new Weapon("icicle-world-giant-hand"){{
                            reload = Float.MAX_VALUE;
                            x = 0f;
                            y = 0f;
                            top = false;
                            mirror = false;
                            layerOffset = -0.0001f;
                            ejectEffect = Fx.casing1;
                            rotationLimit = 25;
                            recoil = 0;
                            bullet = new BasicBulletType(0f, 0){{
                                width = 0f;
                                height = 0f;
                                lifetime = 0f;
                                hitEffect = despawnEffect = Fx.none;
                            }};
                        }},
                    (new Weapon("icicle-world-giant-head"){{
                        reload = 40;
                        x = 0f;
                        y = 0f;
                        top = true;
                        mirror = false;
                        recoil = 0;
                        ejectEffect = Fx.none;
                        bullet = new BasicBulletType(6f, 25){{
                            width = 0.2f;
                            height = 0.2f;
                            lifetime = 1.5f;
                            hitEffect = despawnEffect = Fx.none;
                        }};
                    }})
            );
        }};
        reaver = new MonsterUnitType("reaver"){{
            speed = 0.7f;
            hitSize = 9f;
            health = 320;
            constructor = MechUnit::create;
            weapons.add(new Weapon("icicle-world-reaver-arm"){{
                reload = Float.MAX_VALUE;
                x = 0f;
                y = 0f;
                top = false;
                rotate = true;
                mirror = false;
                layerOffset = -0.0001f;
                ejectEffect = Fx.casing1;
                rotationLimit = 25;
                recoil = 0;
                bullet = new BasicBulletType(0f, 0){{
                    width = 0f;
                    height = 0f;
                    lifetime = 0f;
                    hitEffect = despawnEffect = Fx.none;
                }};
            }},
                    (new Weapon("icicle-world-reaver-head"){{
                        reload = 25;
                        x = 0f;
                        y = 0f;
                        top = true;
                        mirror = false;
                        recoil = 0;
                        ejectEffect = Fx.none;
                        bullet = new BasicBulletType(5f, 10){{
                            width = 0.2f;
                            height = 0.2f;
                            lifetime = 2f;
                            hitEffect = despawnEffect = Fx.none;
                        }};
                    }})
            );
        }};
        swarmling = new MonsterUnitType("swarmling"){{
            speed = 1.65f;
            hitSize = 5f;
            health = 70;
            constructor = MechUnit::create;
            bloodAmount = 15;
            weapons.add((new Weapon("kus"){{
                        reload = 18;
                        x = 0f;
                        y = 0f;
                        top = true;
                        mirror = false;
                        recoil = 0;
                        ejectEffect = Fx.none;
                        bullet = new BasicBulletType(5f, 3){{
                            width = 0.2f;
                            height = 0.2f;
                            lifetime = 2f;
                            hitEffect = despawnEffect = Fx.none;
                        }};
                    }})
            );
        }};
    }
}
